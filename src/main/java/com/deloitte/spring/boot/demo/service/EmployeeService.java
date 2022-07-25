package com.deloitte.spring.boot.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger; // important!
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.spring.boot.demo.model.Employee;
import com.deloitte.spring.boot.demo.reository.EmployeeRepository;

@Service
public class EmployeeService {

//	scenarios - 
//	user tries to get non-existing record (employeeId)
//	user tries to add duplicate record (employeeId)
//	user tries to update non-existing record (employeeId)
//	user tries to delete non-existing record (employeeId)

	@Autowired
	EmployeeRepository empRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Employee> getAllEmployees() {

		return empRepository.findAll();
	}

	public Employee getEmployeeById(int employeeId) {
		LOG.info(Integer.toString(employeeId));
		Optional<Employee> empOptional = empRepository.findById(employeeId);
		if (empOptional.isPresent())
			return empOptional.get();
		else
			return null;
	}

	public Employee addEmployee(Employee employee) {
		LOG.info(employee.toString());
		return empRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		LOG.info(employee.toString());
		if (empRepository.existsById(employee.getEmployeeId()))
			return empRepository.save(employee);
		else
			return null;
	}

	public Employee deleteEmployee(int employeeId) {
		LOG.info(Integer.toString(employeeId));
		Employee emp = this.getEmployeeById(employeeId);
		if (null != emp)
			empRepository.deleteById(employeeId);
		return emp;
	}
}

//package com.deloitte.spring.boot.demo.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.deloitte.spring.boot.demo.model.Employee;
//import com.deloitte.spring.boot.demo.reository.EmployeeRepository;
//
//@Service
//public class EmployeeService {
//
//	@Autowired
//	EmployeeRepository empRepository;
//
//	public List<Employee> getAllEmployees() {
//		return empRepository.findAll();
//	}
//
//	public Employee getEmployeeById(int employeeId) {
//		System.out.println("service getEmployeeById");
//		Optional<Employee> empOptional = empRepository.findById(employeeId);
//		Employee emp = empOptional.get();
//		return emp;
//	}
//
//	public Employee addEmployee(Employee employee) {
//		return empRepository.save(employee);
//	}
//
//	public Employee updateEmployee(Employee employee) {
//		return empRepository.save(employee);
//	}
//
//	public Employee deleteEmployee(int employeeId) {
//		empRepository.deleteById(employeeId);
//		return null;
//	}
//}
