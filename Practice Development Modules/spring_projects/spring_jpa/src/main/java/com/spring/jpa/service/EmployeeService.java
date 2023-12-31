package com.spring.jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.model.Employee;
import com.spring.jpa.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepo;
	
	public Employee addEmployee(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}
	
	//Not working 
//	public Employee getEmployee(Integer id) {
//		return employeeRepo.getById(id);
//	}
	
	
}
