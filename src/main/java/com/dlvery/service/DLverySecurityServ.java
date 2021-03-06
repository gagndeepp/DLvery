package com.dlvery.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class DLverySecurityServ extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated().and().formLogin().permitAll().and().httpBasic();
	}

	@Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails steve = User.withUsername("steve").password("steve").roles("admin").build();
		UserDetails saksham = User.withUsername("saksham").password("saksham").roles("admin").build();
			
		List<UserDetails> users = new ArrayList<>();
		users.add(steve);
		users.add(saksham);
		
		InMemoryUserDetailsManager usersManager = new InMemoryUserDetailsManager(users);
		return usersManager;
	}
}
