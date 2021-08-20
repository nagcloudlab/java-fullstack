package com.example.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class InMemoryUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		if (username != null) {
			if (username.equals("Nag@example.com"))
				return new User("Nag@example.com", "12345", new ArrayList<>());
			else
				throw new UsernameNotFoundException("User Name Not Exist");
		}

		return null;
	}

}
