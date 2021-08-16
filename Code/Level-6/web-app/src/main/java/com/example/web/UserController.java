package com.example.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Authority;
import com.example.entity.User;
import com.example.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;


	@PostMapping
	public ResponseEntity<?> doRegister(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		Authority authority=new Authority();
		authority.setId(1);
		user.setAuthorities(Set.of(authority));
		userRepository.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
