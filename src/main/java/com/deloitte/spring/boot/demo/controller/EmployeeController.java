package com.deloitte.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.spring.boot.demo.model.Employee;
import com.deloitte.spring.boot.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	EmployeeService empService;

	@GetMapping("/emp")
	public Employee emp() {
		System.out.println("emp-controller");
		return empService.getEmp();
	}

}
