package com.example.repository;

import java.util.List;

import com.example.entity.Todo;

public interface TodoRepository {

	void save(Todo todo);

	void update(int id, String newTitle);

	void update(int id, boolean completed);

	void delete(int id);

	void clearCompleted();

	List<Todo> getTodos(TodoFilter filter);

	List<Todo> getTodos(String userName);

	int count();

}
