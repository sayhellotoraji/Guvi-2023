package com.spring.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.jdbc.model.Employee;
import com.spring.jdbc.repository.EmployeeRepo;
import com.spring.jdbc.service.EmployeeService;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		// Modification
		
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
	
		// 1. Create an Employee
		Employee emp = context.getBean(Employee.class);
		emp.setId(24);
		emp.setName("Monish");
		
		
		// 2. Save the data to database
		EmployeeRepo repo = context.getBean(EmployeeRepo.class);
		repo.save(emp);
		
		
		// 
		EmployeeService.addEmployee(emp);
		
		System.out.println(repo.findAll());
	}

}
