package com.example.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.entity.Txn;
import com.example.entity.TxnType;
import com.example.repository.JpaTxnRepository;
import com.example.repository.TxnRepository;

@WebServlet(urlPatterns = { "/statement" })
public class StatementController extends HttpServlet {

	private TxnRepository txnRepository;

	@Override
	public void init(ServletConfig config) throws ServletException {
		txnRepository = new JpaTxnRepository();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession httpSession = req.getSession(false);
		if (httpSession != null) {
			String filter = req.getParameter("filter");

			List<Txn> txns = new ArrayList<>();
			if (filter == null || filter.equals("all")) {
				txns = txnRepository.findAll();
			}
			if (filter != null) {
				if (filter.equals("top10")) {
					txns = txnRepository.findByLimit(10);
				}

				if (filter.equals("credit") || filter.equals("debit")) {
					txns = txnRepository.findTxnType(TxnType.valueOf(filter.toUpperCase()));
				}
			}

			req.setAttribute("txns", txns);
			req.getRequestDispatcher("/WEB-INF/statement.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("login.html");
		}

	}

}
