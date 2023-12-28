package com.spring.jdbc.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jdbc.service.EmployeeService;
import com.spring.jdbc.model.Employee;

@RestController
public class EmployeeController {
	@GetMapping("getEmployeeList")
	public ResponseEntity<Map<Integer, Employee>> getEmployeeList() {
		return ResponseEntity.ok().body(EmployeeService.employeeList);
	}

	@GetMapping("getEmployee/{empId}")
	@ResponseStatus(HttpStatus.NO_CONTENT) // Just for Checking in Network responses
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") int empId) {
		return ResponseEntity.ok().body(EmployeeService.employeeList.get(empId));
	}

	@GetMapping("search")
	@ResponseStatus(HttpStatus.NO_CONTENT) // Just for Checking in Network responses
	public ResponseEntity<Employee> getEmployeeQuery(@RequestParam("empId") int empId) {
		return ResponseEntity.ok().body(EmployeeService.employeeList.get(empId));
	}

	@CrossOrigin(origins = "localhost:8080")
	@DeleteMapping("deleteEmployee/{empId}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity<Map<Integer, Employee>> deleteEmployee(@PathVariable("empId") int empId) {
		EmployeeService.employeeList.remove(empId);
		return ResponseEntity.ok().body(EmployeeService.employeeList);
	}

}
