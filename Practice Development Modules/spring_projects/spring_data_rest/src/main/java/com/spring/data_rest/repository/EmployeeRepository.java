package com.spring.data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.spring.data_rest.model.Employee;

/*
 * the detault enpoint is 
 * Get Request 				- employee
 * Post, Put, Delete Request- employee/id
*/

@RepositoryRestResource(collectionResourceRel = "employee", path="employee")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
