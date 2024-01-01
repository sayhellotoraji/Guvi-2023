package com.spring.jpa.service;

import java.util.ArrayList;
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

	private List<Employee> employeeList = new ArrayList<>();

	public List<Employee> addEmployee(Employee emp) {
		employeeRepo.save(emp);
		return employeeRepo.findAll();
	}

	public List<Employee> updateEmployee(Employee emp) {
		employeeRepo.saveAndFlush(emp);
		return employeeRepo.findAll();

	}

	public List<Employee> deleteEmployee(Integer id) {
		employeeRepo.deleteById(id);
		return employeeRepo.findAll();
	}

	public Optional<Employee> getEmployeeById(Integer id) {
		return employeeRepo.findById(id);
	}
	
	public Optional<Employee> getEmployeeByName(String name) {
		return employeeRepo.getEmployeeByName(name);
	}

	public List<Employee> findAllEmployees() {
		return employeeRepo.findAll();
	}
}