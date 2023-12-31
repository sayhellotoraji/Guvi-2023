package com.spring.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Employee;
import com.spring.jpa.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@CrossOrigin("*")
	@PostMapping("addEmployee")
	@ResponseStatus(HttpStatus.ACCEPTED) // Just for Checking in Network responses
	public void addEmployee(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
	}
	
	@GetMapping("getEmployees")
	public ResponseEntity<List<Employee>> getEmployees(){
		return ResponseEntity.ok().body(employeeService.getEmployees());
	}

	//Not working
//	@GetMapping("getEmployee/{id}")
//	public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
//		return ResponseEntity.ok().body(employeeService.getEmployee(id));
//	}
}
