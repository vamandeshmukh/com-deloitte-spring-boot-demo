package com.deloitte.spring.boot.demo;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Vaman Deshmukh
 * @description Spring boot demo project for Deloitte trainees July 2022
 *              {@link https://github.com/vamandeshmukh/com-deloitte-spring-boot-demo}
 * 
 */

@SpringBootApplication
@EnableEurekaServer
public class App {

	private final static Logger LOG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		LOG.info("Starting deloitte app...");
		SpringApplication.run(App.class, args);
		LOG.info("Started deloitte app...");

	}

}
