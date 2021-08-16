package com.example.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PrivateService;

@RestController
@RequestMapping("/api/private")
public class PrivateEndpoint {
	
	@Autowired
	PrivateService privateService;

	@GetMapping
	public String privateResource(Principal principal) {

		SecurityContext securityContext = SecurityContextHolder.getContext();
		Authentication authentication = securityContext.getAuthentication();

		//System.out.println(authentication.getName());
		System.out.println(principal.getName());
		System.out.println(authentication.getAuthorities());

		return privateService.get();
	}

}
