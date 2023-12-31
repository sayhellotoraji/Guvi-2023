package com.spring.jdbc.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.model.Employee;
import com.spring.jdbc.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	// Not needed - but useful for caching (no database fetching) - Better
	// private List<Employee> employeeList = new ArrayList<>();

	public List<Employee> addEmployee(Employee emp) {

		// if (status == 1) - For debugging
		employeeRepo.addEmployee(emp);
		return employeeRepo.findAll();
	}

	public List<Employee> updateEmployee(Integer id, String name) {

		employeeRepo.updateEmployee(id, name);
		return employeeRepo.findAll();

	}

	public List<Employee> deleteEmployee(Integer id) {
		employeeRepo.deleteEmployee(id);
		return employeeRepo.findAll();
	}

	public Employee getEmployeeById(Integer id) {
		return employeeRepo.getEmployeeById(id);
	}

	public List<Employee> findAllEmployees() {
		return employeeRepo.findAll();
	}
}