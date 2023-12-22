package com.example.demo.service;

import com.example.demo.bean.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeService {
    public static Map<Integer, Employee> employeeList = new HashMap<>();

    public static Map<Integer, Employee> addEmployee(Employee emp) {
        employeeList.put(emp.getEmpId(), emp);
        return employeeList;
    }
}
