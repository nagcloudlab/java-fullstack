package com.example.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.entity.Todo;
import com.example.repository.JpaTodoRepository;
import com.example.repository.TodoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet(urlPatterns = { "/todos" })
public class TodoServlet extends HttpServlet {

	TodoRepository todoRepository = new JpaTodoRepository();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		List<Todo> todos = todoRepository.getTodos();

		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = mapper.writeValueAsString(todos);

		//

		resp.addHeader("Content-Type", "application/json");
		resp.getWriter().write(jsonArray);
		resp.getWriter().close();

	}

}
