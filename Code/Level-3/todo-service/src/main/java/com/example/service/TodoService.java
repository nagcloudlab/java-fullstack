package com.example.service;

import com.example.model.Todo;

import java.util.List;

public interface TodoService {

    Todo createTodo(String title);
    Todo editTodo(int id,String newTitle);
    void completeTodo(int id);
    void completeAll();
    void deleteTodo(int id);
    void clearCompleted();

    List<Todo> getTodos(TodoFilter filter);

}
