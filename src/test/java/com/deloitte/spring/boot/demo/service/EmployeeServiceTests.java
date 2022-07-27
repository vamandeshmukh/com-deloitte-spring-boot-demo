package com.deloitte.spring.boot.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeServiceTests {

	@Autowired
	EmployeeService empService;

	@Test
	public void testGetEmpById() {

		assertEquals("Sonu", empService.getEmployeeById(101).getFirstName());

	}

}
