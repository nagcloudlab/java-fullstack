package com.example.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.entity.Todo;
import com.example.repository.JdbcTodoRepository;
import com.example.repository.TodoFilter;
import com.example.repository.TodoRepository;

@WebServlet(urlPatterns = { "/todos" }) // web.xml
public class ViewTodosServlet extends HttpServlet {

	private TodoRepository jdbcTodoRepository;

	public ViewTodosServlet() {
		System.out.println("ViewTodosServlet :: constructor()");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		jdbcTodoRepository = new JdbcTodoRepository(); // DAO
		System.out.println("ViewTodosServlet :: init()");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("ViewTodosServlet :: doGet()");

		// read input if any from request object

		// process request

		List<Todo> todos = jdbcTodoRepository.getTodos(TodoFilter.ALL);

		// generate dynamic HTTP response

//		PrintWriter out = resp.getWriter();
//		out.print("<html lang=\"en\">");
//		out.print("<head><link href=\"/todo-web-app/css/bootstrap.css\" rel=\"stylesheet\"></head>");
//		out.print("<body class=\"container\">");
//		out.print("<hr/><div>todo-app : using JEE technologies</div><hr/>");
//		out.print(LocalDateTime.now());
//		out.print("</body>");
//		out.print("</html>");
//		out.close();
		
		req.setAttribute("todos", todos);
//
		req.getRequestDispatcher("todos.jsp").forward(req, resp); // template
		

	}

}
