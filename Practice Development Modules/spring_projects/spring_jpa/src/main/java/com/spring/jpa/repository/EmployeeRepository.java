package com.spring.jpa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.jpa.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// Custom query needs to be specifed here.
	//Not working
	//@Query("from employee where name =:name")
	//public Optional<Employee> findEmployeeByName(@Param("name") String name);
}
