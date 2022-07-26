package com.deloitte.spring.boot.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.spring.boot.demo.exception.EmployeeNotFoundException;
import com.deloitte.spring.boot.demo.model.Employee;
import com.deloitte.spring.boot.demo.reository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees invoked.");
		return empRepository.findAll();
	}

	public Employee getEmployeeById(int employeeId) {
		LOG.info(Integer.toString(employeeId));
		Optional<Employee> empOptional = empRepository.findById(employeeId);
		if (empOptional.isPresent()) {
			Employee emp = empOptional.get();
			LOG.info(emp.toString());
			return emp;
		} else {

			String errorMessage = "Employee with eid " + employeeId + " not found.";
			LOG.warn(errorMessage);
			throw new EmployeeNotFoundException(errorMessage);
		}
	}

	public List<Employee> getEmployeesByFirstName(String firstName) {
		LOG.info(firstName);
		List<Employee> empList = empRepository.findByFirstName(firstName);
		if (!empList.isEmpty() ) {
			return empList;
		} else {
			String errorMessage = "Employee with name " + firstName + " not found.";
			LOG.warn(errorMessage);
			throw new EmployeeNotFoundException(errorMessage);
		}
	}

	public Employee addEmployee(Employee employee) {
		LOG.info(employee.toString());
		return empRepository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		LOG.info(employee.toString());
		Employee emp = this.getEmployeeById(employee.getEmployeeId());
		emp = empRepository.save(employee);
		return emp;
	}

	public Employee deleteEmployee(int employeeId) {
		LOG.info(Integer.toString(employeeId));
		return this.getEmployeeById(employeeId);
	}
}

//package com.deloitte.spring.boot.demo.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.slf4j.Logger; // important!
//import org.slf4j.LoggerFactory;
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
//	private EmployeeRepository empRepository;
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	public List<Employee> getAllEmployees() {
//
//		return empRepository.findAll();
//	}
//
//	public Employee getEmployeeById(int employeeId) {
//		LOG.info(Integer.toString(employeeId));
//		Optional<Employee> empOptional = empRepository.findById(employeeId);
//		if (empOptional.isPresent())
//			return empOptional.get();
//		else
//			return null;
//	}
//
//	public Employee addEmployee(Employee employee) {
//		LOG.info(employee.toString());
//		return empRepository.save(employee);
//	}
//
//	public Employee updateEmployee(Employee employee) {
//		LOG.info(employee.toString());
//		if (empRepository.existsById(employee.getEmployeeId()))
//			return empRepository.save(employee);
//		else
//			return null;
//	}
//
//	public Employee deleteEmployee(int employeeId) {
//		LOG.info(Integer.toString(employeeId));
//		Employee emp = this.getEmployeeById(employeeId);
//		if (null != emp)
//			empRepository.deleteById(employeeId);
//		return emp;
//	}
//}

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
