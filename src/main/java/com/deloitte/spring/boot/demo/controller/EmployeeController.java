package com.deloitte.spring.boot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.spring.boot.demo.model.Employee;
import com.deloitte.spring.boot.demo.service.EmployeeService;

@RestController
public class EmployeeController {

//	HTTP Requests and Spring annotations - 
//	@RequestMapping
//	GET - @GetMapping
//	POST - @PostMapping
//	PUT - @PutMapping
//	DELETE - @DeleteMapping

	@Autowired
	EmployeeService empService;

//	@GetMapping("/get-all-emps")
	@RequestMapping(path = "/get-all-emps", method = RequestMethod.GET)
	public List<Employee> getAllEmps() {
		System.out.println("get-all-emps");
		return empService.getAllEmployees();
	}

	@GetMapping("/get-emp-by-id/{eid}")
	public Employee getEmpById(@PathVariable(name = "eid") int employeeId) {
		System.out.println(employeeId);
		return empService.getEmployeeById(employeeId);
	}

	@RequestMapping(path = "/add-emp", method = RequestMethod.POST)
	public Employee addEmp(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}

	@RequestMapping(path = "/update-emp", method = RequestMethod.PUT)
	public Employee updateEmp(@RequestBody Employee employee) {
		return empService.updateEmployee(employee);
	}

	@RequestMapping(path = "/delete-emp/{eid}", method = RequestMethod.DELETE)
	public Employee deleteEmp(@PathVariable(name = "eid") int employeeId) {
		return empService.deleteEmployee(employeeId);
	}

}
