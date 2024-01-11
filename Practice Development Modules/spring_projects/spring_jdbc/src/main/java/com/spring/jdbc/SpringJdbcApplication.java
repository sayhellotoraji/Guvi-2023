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

		SpringApplication.run(SpringJdbcApplication.class, args);

	}
}


/*
 * Components: Web-JDBC-MySQL
 * 
 * NamedParameterJdbcTemplate - DB Config
 * 
 * 
 */


