package com.spring.jpa;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.jpa.model.Employee;
import com.spring.jpa.repository.EmployeeRepository;
import com.spring.jpa.service.EmployeeService;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringJpaApplication.class, args);

	}

}
