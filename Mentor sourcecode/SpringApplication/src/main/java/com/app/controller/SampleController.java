package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.domain.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class SampleController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add-employee")
	public String getName(@RequestBody Employee emp) {
		int status = employeeService.addEmployee(emp);
		if(status == 1) {
			return "Employee added Successfully";
		} else {
			return "Failuer";
		}
	}
	
	@GetMapping("/get-employee-by-id/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@PutMapping("/update-employee")
	public String updateEmplyee(@RequestBody Employee emp) {
		int status = employeeService.updateEmplyee(emp);
		if(status == 1) {
			return "Employee updated Successfully";
		} else if(status == -1) {
			return "No Record Found";
		} else {
			return "Failuer";
		}
	}
	
	@DeleteMapping("/delete-employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		int status = employeeService.deleteEmployee(id);
		if(status == 1) {
			return "Employee deleted Successfully";
		} else {
			return "Failuer";
		}
	}
	
	@GetMapping("/get-employee")
	public List<Employee> getEmployee() {
		List<Employee> employees = employeeService.getEmployees();
		return employees;
	}
}
