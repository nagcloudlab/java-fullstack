package com.example.web;

import java.security.Principal;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateEndPoint {

	@GetMapping("/api/private")
	public String get(Principal principal) {
		System.out.println(principal.getName());
		SecurityContext context = SecurityContextHolder.getContext();
		System.out.println(context.getAuthentication().getName());
		return "PRIVATE RESOURCE";
	}

}
