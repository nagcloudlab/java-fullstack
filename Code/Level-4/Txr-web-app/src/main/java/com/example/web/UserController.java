package com.example.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/login"})
public class UserController extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		if(username.equals("admin")&&password.equals("admin")) {
			HttpSession httpSession= req.getSession(); // Map collection...
			httpSession.setAttribute("currentUser", "ADMIN");
			resp.sendRedirect("txr");
		}else {
			resp.sendRedirect("login.html");
		}
		
	
	}
	
}
