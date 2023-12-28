package com.spring.jdbc.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.model.Employee;
import com.spring.jdbc.service.EmployeeService;

@Repository
public class EmployeeRepo {

	@Autowired
	private NamedParameterJdbcTemplate template;

	public void save(Employee emp) {

		String sql = "insert into Employee values (:id, :name)";

		Map namedParameter = new HashMap<>();
		namedParameter.put("id", emp.getId());
		namedParameter.put("name", emp.getName());

		int status = template.update(sql, namedParameter);
		if (status == 1) {
			System.out.println("Added successfully");
		}

		else {
			System.out.println("Not inserted");
		}
	}

	
	// Backend return the data from application not from database
	public Map<Integer, Employee> findAll() {
		return EmployeeService.getEmployees();
	}
}
