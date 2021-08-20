package com.example.web;

import java.security.Principal;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Todo;

@CrossOrigin(origins = "*")
@RestController
public class TodosRestController {

	@GetMapping("/api/todos")
	public ResponseEntity<?> get(Principal principal) {
		System.out.println(principal.getName());
		SecurityContext context = SecurityContextHolder.getContext();
		System.out.println(context.getAuthentication().getName());
		
		
		List<Todo> todos=List.of(
				new Todo(1, "go to chennai", false),
				new Todo(1, "bring kids", false)
		);
		
		return ResponseEntity.ok().body(todos);
		
		
	}

}
