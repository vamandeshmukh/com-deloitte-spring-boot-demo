package com.deloitte.spring.boot.demo.service;

import com.deloitte.spring.boot.demo.model.Employee;

public class EmployeeService {

	public Employee getEmp() {
		Employee emp = new Employee(101, "Sonu", 90000);
		System.out.println("emp-service");
		return emp;
	}

}
