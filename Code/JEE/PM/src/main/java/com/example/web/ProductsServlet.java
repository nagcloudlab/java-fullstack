package com.example.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.entity.Product;
import com.example.entity.ProductType;
import com.example.repository.JdbcProductRepository;
import com.example.repository.ProductRepository;

@WebServlet(urlPatterns = {"/save_product","/view_products"})
public class ProductsServlet extends HttpServlet {

	ProductRepository productRepository = new JdbcProductRepository();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			List<Product> products= productRepository.findAll();
			req.setAttribute("all-products", products);
		} catch (SQLException e) {
			req.setAttribute("message", "product-not-saved");
		}
		
		req.getRequestDispatcher("view_products.jsp").forward(req, resp);
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		double price = Double.parseDouble(req.getParameter("price"));
		ProductType type = ProductType.valueOf(req.getParameter("type"));

		Product product = new Product(name, price, type);
		try {
			productRepository.save(product);
//			System.out.println("product saved..");
//			resp.getWriter().write("product-saved");
			req.setAttribute("message", "product-saved");
		} catch (SQLException e) {
//			resp.getWriter().write("product-not-saved");
			req.setAttribute("message", "product-not-saved");
		}
		
		req.getRequestDispatcher("status.jsp").forward(req, resp);

	}

}
