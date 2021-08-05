package com.example.api;

import com.example.model.Todo;
import com.example.service.TodoFilter;
import com.example.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = {"*"})
@Controller
@RequestMapping("/api/v1/todos")
public class TodoController {

    TodoService todoService;

    RestTemplate restTemplate=new RestTemplate();

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @GetMapping("/external")
    public ResponseEntity<?> getTodosFromExternal(){
        System.out.println("external");
        Object[] oa=restTemplate.getForObject("http://jsonplaceholder.typicode.com/todos",Object[].class);
        for(Object o:oa){
            System.out.println(o);
        }
        return  ResponseEntity.ok().body(Arrays.asList(oa));
    }

    //    @RequestMapping(value="/api/v1/todos",method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity<?> getTodos(){
        List<Todo> todos=todoService.getTodos(TodoFilter.ALL); // Resource
        return ResponseEntity.ok(todos);
    }
    @PostMapping
    public ResponseEntity<?> createTodo(@RequestBody Todo todo){
       Todo savedTodo=todoService.createTodo(todo.getTitle());
       return  ResponseEntity.status(HttpStatus.CREATED).body(savedTodo);
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<?> updateTodo(@PathVariable int id, @RequestBody Todo todo){
        Todo updatedTodo=todoService.editTodo(id,todo.getTitle());
        return ResponseEntity.ok(updatedTodo);
    }
    @DeleteMapping(value="/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable int id){
        todoService.deleteTodo(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
