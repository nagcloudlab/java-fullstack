package com.example.service;

import com.example.model.Todo;
import com.example.repository.TodoRepository;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class TodoServiceImpl implements  TodoService{

    TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public Todo createTodo(String title) {
        Todo newTodo=new Todo();
        newTodo.setTitle(title);
        return todoRepository.save(newTodo); // insert into TABLE values(.....)
    }

    @Override
    public Todo editTodo(int id, String newTitle) {
        Todo todo=todoRepository.findById(id).orElseThrow();
        todo.setTitle(newTitle);
        return todoRepository.save(todo); // update TABLE set title=? where id=?
    }

    @Override
    public void completeTodo(int id) {
        Todo todo=todoRepository.findById(id).orElseThrow();
        todo.setCompleted(!todo.isCompleted());
    }

    @Override
    public void completeAll() {
       List<Todo> todos= todoRepository.findAll();
       boolean arAllCompleted=todos.stream().allMatch(todo->todo.isCompleted());
       todos.forEach(todo->todo.setCompleted(!arAllCompleted));
    }

    @Override
    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }

    @Override
    public void clearCompleted() {
        Todo exTodo=new Todo();
        exTodo.setCompleted(true);
        Example<Todo> ex=Example.of(exTodo);
        List<Todo> completedTodos= todoRepository.findAll(ex);
        List<Integer> completedTodoIds=completedTodos.stream().map(e->e.getId()).collect(Collectors.toList());
        todoRepository.deleteAllById(completedTodoIds);
    }

    @Override
    public List<Todo> getTodos(TodoFilter filter) {
        return todoRepository.findAll();
    }
}
