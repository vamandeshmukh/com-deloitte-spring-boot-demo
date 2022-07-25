package com.deloitte.spring.boot.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.spring.boot.demo.model.Employee;
import com.deloitte.spring.boot.demo.reository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepository;

	public List<Employee> getAllEmployees() {
		return empRepository.findAll();
	}

	public Employee getEmployeeById(int employeeId) {
		System.out.println("service getEmployeeById");
		Optional<Employee> empOptional = empRepository.findById(employeeId);
		Employee emp = empOptional.get();
		return emp;
	}

	public Employee addEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	public Employee deleteEmployee(int employeeId) {
		empRepository.deleteById(employeeId);
		return null;
	}
}
