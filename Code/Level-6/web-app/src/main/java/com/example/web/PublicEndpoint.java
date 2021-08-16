package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class PublicEndpoint {
	
	@RequestMapping(method = RequestMethod.GET)
	public String publicResource() {
		return "public-resource";
	}

}
