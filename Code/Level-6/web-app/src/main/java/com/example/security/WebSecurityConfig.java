package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/css/*").permitAll()
		.antMatchers("/api/public/**" ).permitAll()
		.antMatchers("/register-form.html" ).permitAll()
		.antMatchers(HttpMethod.POST,"/register").permitAll()
		.anyRequest().authenticated()
		.and()
			.formLogin()
			    .loginPage("/login-form.html")
			    .loginProcessingUrl("/login")
			    .defaultSuccessUrl("/", true)
			    .failureUrl("/login-form.html?error=true")
				.permitAll()
		.and()
			.logout()
				.permitAll();
		
	}
	
	
	@Bean
	public PasswordEncoder encoder() {
	    return new BCryptPasswordEncoder();
	}
	
	
	
//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		
//		UserDetails user1 =
//			 User.withDefaultPasswordEncoder()
//				.username("joe@example.com")
//				.password("password")
//				.roles("USER")
//				.build();
//		
//		UserDetails user2 =
//			 User.withDefaultPasswordEncoder()
//				.username("admin@example.com")
//				.password("password")
//				.roles("USER","ADMIN")
//				.build();
//
//		return new InMemoryUserDetailsManager(user1,user2); 
//	}
	

} 
