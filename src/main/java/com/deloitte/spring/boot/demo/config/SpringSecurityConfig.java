package com.deloitte.spring.boot.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication()
				//
				.withUser("user").password("{noop}password").roles("USER")
				//
				.and().
				//
				withUser("admin").password("{noop}password").roles("USER", "ADMIN");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.httpBasic()
				//
				.and()
				//
				.authorizeRequests()
				//
				.antMatchers(HttpMethod.GET, "/emp/**").hasRole("USER")
				//
				.antMatchers(HttpMethod.POST, "/emp/**").hasRole("ADMIN")
				//
				.antMatchers(HttpMethod.PUT, "/emp/**").hasRole("ADMIN")
				//
				.antMatchers(HttpMethod.DELETE, "/emp/**").hasRole("ADMIN")
				//
				.antMatchers(HttpMethod.GET, "/dept/**").hasRole("USER")
				//
				.antMatchers(HttpMethod.POST, "/dept/**").hasRole("ADMIN")
				//
				.antMatchers(HttpMethod.PUT, "/dept/**").hasRole("ADMIN")
				//
				.antMatchers(HttpMethod.DELETE, "/dept/**").hasRole("ADMIN")
				//
				.and()
				//
				.csrf().disable()
				//
				.formLogin().disable();
	}

	/*
	 * @Bean public UserDetailsService userDetailsService() { //ok for demo
	 * User.UserBuilder users = User.withDefaultPasswordEncoder();
	 * 
	 * InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	 * manager.createUser(users.username("user").password("password").roles("USER").
	 * build());
	 * manager.createUser(users.username("admin").password("password").roles("USER",
	 * "ADMIN").build()); return manager; }
	 */

}
