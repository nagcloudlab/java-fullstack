package com.example;

import java.util.Collections;
import java.util.List;

import com.example.entity.User;
import com.example.repository.JdbcUserRepository;
import com.example.repository.UserRepository;

public class App {

	public static void main(String[] args) {

		UserRepository userRepository = new JdbcUserRepository();

//		User user1 = new User("Nag", "nag@mail.com", "9945674228");
//		User user2 = new User("Indu", "indu@mail.com", "1234567890");
//		User user3 = new User("Riya", "riya@mail.com", "9876543210");
//		User user4 = new User("Riya", "diya@mail.com", "6473892010");
//
//		userRepository.save(user1);
//		userRepository.save(user2);
//		userRepository.save(user3);
//		userRepository.save(user4);
//
//		System.out.println("Done");

//		List<User> allUsers = userRepository.findAll();
//		allUsers.forEach(System.out::println);

		// SQL injection
		List<User> users = userRepository.findByMobile("9945674228 || 'a'='a'");
		users.forEach(System.out::println);

	}

}
