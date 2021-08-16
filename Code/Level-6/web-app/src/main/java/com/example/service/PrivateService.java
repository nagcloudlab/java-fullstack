package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class PrivateService {

	// @RolesAllowed(value = {"ROLE_ADMIN"})
	public String get() {
		return "private-resource";
	}

}
