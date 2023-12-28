package com.example.demo.controller;

import com.example.demo.bean.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

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


    @CrossOrigin(origins="localhost:8080")
    @DeleteMapping("deleteEmployee/{empId}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Map<Integer, Employee>> deleteEmployee(@PathVariable("empId") int empId){
        EmployeeService.employeeList.remove(empId);
        return ResponseEntity.ok().body(EmployeeService.employeeList);
    }

}
