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
		System.out.println("Monish created");
		
		
		// 2. Save the data to database
		EmployeeRepo repo = context.getBean(EmployeeRepo.class);
		repo.addEmployee(emp);
		
		
		// 3. Modify the data in the database
		repo.updateEmployee(24, "Maha");
		
		
		// Testing api from Service layer using postman
		EmployeeService.add();
		
		System.out.println(repo.findAll());
	}

}
