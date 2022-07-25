package com.deloitte.spring.boot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.spring.boot.demo.model.Employee;
import com.deloitte.spring.boot.demo.service.EmployeeService;

@RestController
public class EmployeeController {

//	EmployeeService empService = new EmployeeService();

	@Autowired
	EmployeeService empService;

	@GetMapping("/emp")
	public Employee emp() {
		System.out.println("emp-controller");
		return empService.getEmp();
	}

//	getAllEmps 

	@GetMapping("/get-all-emps")
	public List<Employee> getAllEmps() {
		System.out.println("emp-controller");
		return empService.getAllEmployees();
	}

}








