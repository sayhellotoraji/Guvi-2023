package com.example.demo;

import com.example.demo.bean.Employee;
import com.example.demo.controller.EmployeeController;
import com.example.demo.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        Employee emp1 = new Employee(1, "Raja");
        EmployeeService.addEmployee(emp1);


        Employee emp2 = new Employee(2, "Sekar");
        EmployeeService.addEmployee(emp2);
    }

}
