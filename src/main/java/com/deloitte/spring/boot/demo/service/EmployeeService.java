package com.deloitte.spring.boot.demo.service;

import java.util.ArrayList;

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

	public Employee getEmployeeById() {
		System.out.println("service getEmployeeById");

		Optional<Employee> empOptional = empRepository.findById(101);
		Employee emp = empOptional.get();
		return emp;
	}

	public List<Employee> getAllEmployees() {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(102, "Monu", 909090));
		empList.add(new Employee(103, "Tonu", 909090));
		empList.add(new Employee(104, "Ponu", 909090));

		return empList;

	}

}
