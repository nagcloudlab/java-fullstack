package com.example.web;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Authority;
import com.example.entity.User;
import com.example.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;


	@PostMapping("/register")
	public String doRegister(@ModelAttribute User user) {
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		Authority authority=new Authority();
		authority.setId(1);
		user.setAuthorities(Set.of(authority));
		userRepository.save(user);
		
		return "redirect:login-form.html";
	}

}
