package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.entity.Todo;
import com.example.repository.JdbcTodoRepository;
import com.example.repository.TodoRepository;

@WebServlet(urlPatterns = {"/new-todo"})
public class AddNewTodoServlet extends HttpServlet {

	TodoRepository todoRepository=new JdbcTodoRepository();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String title=req.getParameter("title");
		
		Todo todo=new Todo(title);
		
		todoRepository.save(todo);
		
		
		resp.sendRedirect("todos");
		
	}

}
