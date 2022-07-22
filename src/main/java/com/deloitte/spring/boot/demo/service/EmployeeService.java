package com.deloitte.spring.boot.demo.service;

import org.springframework.stereotype.Service;

import com.deloitte.spring.boot.demo.model.Employee;

@Service
public class EmployeeService {

	public Employee getEmp() {
		Employee emp = new Employee(101, "Sonu", 90000);
		System.out.println("emp-service");
		return emp;
	}

}
