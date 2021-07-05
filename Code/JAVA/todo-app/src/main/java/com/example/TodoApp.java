package com.example;

import java.sql.SQLException;

import com.example.repository.JdbcTodoRepository;
import com.example.repository.TodoFilter;
import com.example.repository.TodoRepository;

public class TodoApp {

	public static void main(String[] args) throws SQLException {

		TodoRepository todoRepository = new JdbcTodoRepository(); // a.k.a D.A.O

		// 1- add todo
//		Todo todo = new Todo("item-1", false);
//		todoRepository.save(todo);

		// 2- Edit | update todo
//		todoRepository.update(1, "item-one");

		// 3- complete todo ( toggle )
//		todoRepository.update(3, true);

		// 4- delete todo
//		todoRepository.delete(1);

		// 5- clearCompleted
//		todoRepository.clearCompleted();

		// 6- viewTodo ( ALL | Active | Completed )
//		todoRepository.getTodos(TodoFilter.COMPLETED)
//		.forEach(todo->System.out.println(todo));

		// 7. count
//		System.out.println(todoRepository.count());

	}

}
