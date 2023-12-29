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

	private List<Employee> employeeList = new ArrayList<>();

	public List<Employee> addEmployee(Employee emp) {
		employeeList.clear();
		int status = employeeRepo.addEmployee(emp);
		if (status == 1)
			employeeList.addAll(employeeRepo.findAll());
		return employeeList;
	}

	public List<Employee> updateEmployee(Integer id, String name) {
		employeeList.clear();
		int status = employeeRepo.updateEmployee(id, name);
		if (status == 1)
			employeeList.addAll(employeeRepo.findAll());
		return employeeList;
	}

	public List<Employee> deleteEmployee(Integer id) {
		employeeList.clear();
		int status = employeeRepo.deleteEmployee(id);
		if (status == 1)
			employeeList.addAll(employeeRepo.findAll());
		return employeeList;
	}

	public Employee getEmployeeById(Integer id) {
		employeeList.clear();
		Employee emp = employeeRepo.getEmployeeById(id);
		return emp;
	}

	public List<Employee> findAllEmployees() {
		employeeList.clear();
		employeeList.addAll(employeeRepo.findAll());
		return employeeList;
	}
}