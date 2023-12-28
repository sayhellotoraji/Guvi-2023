package com.spring.jdbc.service;

import java.util.HashMap;
import java.util.Map;

import com.spring.jdbc.model.Employee;


// not yet connected to frontend
// Frontend and backend works fine independently
public class EmployeeService {
    public static Map<Integer, Employee> employeeList = new HashMap<>();

    public static Map<Integer, Employee> addEmployee(Employee emp) {
        employeeList.put(emp.getId(), emp);
        return employeeList;
    }
    
    public static Map<Integer, Employee> getEmployees() {
        return employeeList;
    }
}