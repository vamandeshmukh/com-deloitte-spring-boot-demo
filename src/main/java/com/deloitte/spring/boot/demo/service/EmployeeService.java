package com.deloitte.spring.boot.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deloitte.spring.boot.demo.model.Employee;

@Service
public class EmployeeService {

	public Employee getEmp() {
		Employee emp = new Employee(101, "Sonu", 90000);
		System.out.println("emp-service");
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
