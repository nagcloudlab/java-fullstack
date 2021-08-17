package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class AuthByTokenApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthByTokenApplication.class, args);
	}

}
