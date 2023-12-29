package com.spring.jdbc.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jdbc.service.EmployeeService;
import com.spring.jdbc.model.Employee;

@RestController
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@CrossOrigin("*")
	@PostMapping("addEmployee")
	@ResponseStatus(HttpStatus.ACCEPTED) // Just for Checking in Network responses
	public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee emp) {
		employeeService.addEmployee(emp);
		return ResponseEntity.ok().body(employeeService.findAllEmployees());
	}

	@GetMapping("getEmployees")
	public ResponseEntity<List<Employee>> getEmployees() {
		return ResponseEntity.ok().body(employeeService.findAllEmployees());
	}

	@CrossOrigin("*")
	@PutMapping("updateEmployee")
	@ResponseStatus(HttpStatus.NO_CONTENT) // Just for Checking in Network responses
	public ResponseEntity<List<Employee>> updateEmployee(@RequestBody Employee emp) {
		employeeService.updateEmployee(emp.getId(), emp.getName());
		return ResponseEntity.ok().body(employeeService.findAllEmployees());
	}

	@CrossOrigin("*")
	@DeleteMapping("deleteEmployee/{empId}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable("empId") int empId) {
		employeeService.deleteEmployee(empId);
		return ResponseEntity.ok().body(employeeService.findAllEmployees());
	}

	// Not working
	@GetMapping("getEmployee/{empId}")
	@ResponseStatus(HttpStatus.NO_CONTENT) // Just for Checking in Network responses
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") int empId) {
		Employee emp = employeeService.getEmployeeById(empId);
		return ResponseEntity.ok().body(emp);
	}

	@GetMapping("search")
	@ResponseStatus(HttpStatus.NO_CONTENT) // Just for Checking in Network responses
	public ResponseEntity<Employee> getEmployeeQuery(@RequestParam("empId") int empId) {
		return ResponseEntity.ok().body(employeeService.findAllEmployees().get(empId));
	}

}
