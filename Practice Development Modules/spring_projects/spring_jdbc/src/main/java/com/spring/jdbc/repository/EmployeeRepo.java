package com.spring.jdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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

	private static final String addEmployee = "insert into Employee values (:id, :name)";
	private static final String employeeById = "select id, name from employee where id =:id";
	private static final String deleteEmployeeById = "delete from employee where id =:id";
	private static final String updateEmployeeById = "update Employee set name =:name where id =:id";
	private static final String getEmployees = "select id, name from Employee";

	@Autowired
	private NamedParameterJdbcTemplate template;

	public void addEmployee(Employee emp) {
		Map namedParameter = new HashMap<>();
		namedParameter.put("id", emp.getId());
		namedParameter.put("name", emp.getName());
		int status = template.update(addEmployee, namedParameter);
		
		// Status condition is to check if the code is working properly
		// Not mandatory
		if (status == 1) {
			System.out.println("Added successfully");
		} else {
			System.out.println("Not inserted");
		}
	}

	public int deleteEmployee(int id) {
		Map namedParameter = new HashMap();
		namedParameter.put("id", id);
		int status = template.update(deleteEmployeeById, namedParameter);
		return status;
	}

	public int updateEmployee(Integer id, String name) {
		Map namedParameter = new HashMap();
		namedParameter.put("id", id);
		namedParameter.put("name", name);
		int status = template.update(updateEmployeeById, namedParameter);
		return status;
	}

	public Employee getEmployeeById(int id) {
		Employee emp = null;
		try {
			Map namedParameter = new HashMap();
			namedParameter.put("id", id);

			// queryForObject - returns a single record
			emp = (Employee) template.queryForObject(employeeById, namedParameter, (rs, rowNum) -> employeeMapper(rs));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return emp;
	}

	public List<Employee> findAll() {

		// query - returns all the records
		List<Employee> employees = template.query(getEmployees, (rs, rowNum) -> employeeMapper(rs));
		return employees;
	}

	private Employee employeeMapper(ResultSet rs) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		return emp;
	}

}
