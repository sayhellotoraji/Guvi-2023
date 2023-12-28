package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeRepository;
import com.app.domain.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public int addEmployee(Employee emp) {
		return employeeRepository.addEmployee(emp);
	}
	
	public int deleteEmployee(int id) {
		return employeeRepository.deleteEmployee(id);
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public int updateEmplyee(Employee emp) {
		Employee e = employeeRepository.getEmployeeById(emp.getId());
		if(e != null) {
			return employeeRepository.updateEmployee(emp);
		} else {
			return -1;
		}
	}
	
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}

}
