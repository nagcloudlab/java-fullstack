package com.example.web;

import com.example.repository.AccountRepository;
import com.example.repository.JpaAccountRepository;
import com.example.repository.JpaTxnRepository;
import com.example.repository.TxnRepository;
import com.example.service.TxrService;
import com.example.service.TxrServiceImpl;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/txr"})
public class TxrController extends HttpServlet {

    TxrService txrService;

    @Override
    public void init(ServletConfig config) throws ServletException {
        AccountRepository accountRepository=new JpaAccountRepository();
        TxnRepository txnRepository=new JpaTxnRepository();
        txrService=new TxrServiceImpl(accountRepository,txnRepository);
    }

    // GET /txr
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession httpSession=req.getSession(false);
    	if(httpSession!=null) {
    		req.getRequestDispatcher("/WEB-INF/txr-form.jsp").forward(req, resp);
    	}else {
    		resp.sendRedirect("login.html");
    	}
    }
    

    // POST /txr
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    	HttpSession httpSession=req.getSession(false);
    	if(httpSession!=null) {
        // Input
        double amount=Double.parseDouble(req.getParameter("amount"));
        String fromAccNum=req.getParameter("fromAccNum");
        String toAccNum=req.getParameter("toAccNum");

        // Process
        txrService.txr(amount,fromAccNum,toAccNum);

        // Output
        // PLAIN-TEXT,HTML,JSON,XML , or media type
        req.setAttribute("message", "txr successfull");
        req.getRequestDispatcher("txr-status.jsp").forward(req, resp);
        
    	}else {
    		resp.sendRedirect("login.html");
    	}
     
    }
}
