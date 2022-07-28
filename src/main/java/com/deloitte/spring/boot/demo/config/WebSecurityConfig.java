package com.deloitte.spring.boot.demo.config;

public class WebSecurityConfig {

}
//
//package com.deloitte.spring.boot.demo.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//
//		http.authorizeRequests()
//				//
//				.antMatchers(HttpMethod.GET, "/emp/**").hasRole("USER")
//				//
//				.antMatchers(HttpMethod.POST, "/**").hasRole("USER")
//				//
//				.antMatchers("/hi", "/hello", "/login").permitAll()
//		//
//		;
//	}
//
//	@SuppressWarnings("deprecation")
//	@Bean
//	@Override
//	public UserDetailsService userDetailsService() {
//		UserDetails user = User.withDefaultPasswordEncoder().username("user").password("password").roles("USER")
//				.build();
//
//		return new InMemoryUserDetailsManager(user);
//	}
//}
//
//////package com.deloitte.spring.boot.demo.config;
//////
//////import org.springframework.context.annotation.Configuration;
//////import org.springframework.http.HttpMethod;
//////import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//////import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//////
////////import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//////
//////@Configuration
////////@EnableWebSecurity
//////
//////public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//////
//////	@Override
//////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//////
//////		auth.inMemoryAuthentication()
//////				// code
//////				.withUser("vaman").password("{noop}vaman").roles("USER")
//////				// code
//////				.and().
//////				// code
//////				withUser("admin").password("{noop}admin").roles("USER", "ADMIN");
//////
//////	}
//////
//////	@Override
//////	protected void configure(HttpSecurity http) throws Exception {
//////
//////		http.httpBasic()
//////				// code
//////				.and().authorizeRequests()
//////				// hello code
//////				.antMatchers("/hi").hasRole("USER")
//////				// emp code
//////				.antMatchers(HttpMethod.GET, "/emp/**").hasRole("USER")
//////				// emp code
//////				.antMatchers(HttpMethod.POST, "/emp/**").hasRole("USER")
//////				// emp code
//////				.antMatchers(HttpMethod.PUT, "/emp/**").hasRole("USER")
//////				// emp code
//////				.antMatchers(HttpMethod.DELETE, "/emp/**").hasRole("USER")
//////				// dept code
//////				.antMatchers(HttpMethod.GET, "/dept/**").hasRole("ADMIN")
//////				// dept code
//////				.antMatchers(HttpMethod.POST, "/dept").hasRole("ADMIN")
//////				// dept code
//////				.antMatchers(HttpMethod.PUT, "/dept/**").hasRole("ADMIN")
//////				// dept code
//////				.antMatchers(HttpMethod.DELETE, "/dept/**").hasRole("ADMIN")
//////				// code
//////				.and()
//////				// code
////////				.csrf().disable()
//////				// code
//////				.formLogin()
//////// code
//////		;
//////
//////	}
//////}