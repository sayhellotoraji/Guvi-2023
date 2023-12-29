package com.spring.jdbc.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.model.Employee;
import com.spring.jdbc.repository.EmployeeRepo;


// not yet connected to frontend
// Frontend and backend works fine independently

@Service
public class EmployeeService {
	public static Map<Integer, Employee> employeeList = new HashMap<>();
	
	// Need Modification
	// Add Service to Repository connection
	public static void add() {
		Employee emp = new Employee();
		emp.setId(10);
		emp.setName("Raj");
		employeeList.put(10, emp);
	}
	
	


}