package com.example.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.repository.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Optional<com.example.entity.User> optional = userRepository.findById(username);
		com.example.entity.User dbUser = optional.orElseThrow(() -> new UsernameNotFoundException(username));

		String[] authorities=dbUser
							 .getAuthorities()
				             .stream()
				             .map(authority->authority.getName())
				             .toArray(String[]::new);
		
		User user =new User(dbUser.getEmail(),dbUser.getPassword(),AuthorityUtils.createAuthorityList(authorities));
	
		return user;
	}

}
