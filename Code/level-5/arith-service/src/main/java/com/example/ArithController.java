package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArithController {

	@GetMapping("/api/arith/add/{n1}/{n2}")
	public int add(@PathVariable int n1,@PathVariable int n2) {
		int result=n1+n2;
		return result;
	}
	
}
