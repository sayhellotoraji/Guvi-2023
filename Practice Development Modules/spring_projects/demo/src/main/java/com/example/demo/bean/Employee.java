package com.example.demo.bean;


import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int empId;
    private String empName;
}
