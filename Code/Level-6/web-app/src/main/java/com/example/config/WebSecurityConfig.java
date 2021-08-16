package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.authorizeRequests()
		.antMatchers("/api/public/**" ).permitAll()
		.anyRequest().authenticated()
		.and()
			.formLogin()
				.permitAll()
		.and()
			.logout()
				.permitAll();
		
	}
	
	
	
	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		
		UserDetails user1 =
			 User.withDefaultPasswordEncoder()
				.username("joe@example.com")
				.password("password")
				.roles("USER")
				.build();
		
		UserDetails user2 =
			 User.withDefaultPasswordEncoder()
				.username("admin@example.com")
				.password("password")
				.roles("USER","ADMIN")
				.build();

		return new InMemoryUserDetailsManager(user1,user2); 
	}
	

} 
