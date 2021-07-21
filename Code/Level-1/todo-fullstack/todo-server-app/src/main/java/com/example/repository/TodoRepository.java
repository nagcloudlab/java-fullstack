package com.example.repository;

import java.util.List;

import com.example.entity.Todo;

public interface TodoRepository {

	void save(Todo todo);

	void updateTitle(int id, String newTitle);

	void updateCompleted(int id, boolean completed);

	void delete(int id);

	void clearCompleted();

	List<Todo> getTodos();

}