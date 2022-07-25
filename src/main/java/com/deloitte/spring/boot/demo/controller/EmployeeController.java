package com.deloitte.spring.boot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

//	HTTP Requests - 
//	@RequestMapping
//	@PostMapping
//	@PutMapping
//	@DeleteMapping
//	@GetMapping

//	@GetMapping("/get-all-emps")
	@RequestMapping(path = "/get-all-emps", method = RequestMethod.GET)
//	@RequestMapping("/get-all-emps") // Don't use this 
	public List<Employee> getAllEmps() {
		System.out.println("emp-controller");
		return empService.getAllEmployees();
	}

}














