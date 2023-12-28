package com.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.domain.Employee;

@Repository
public class EmployeeRepository {
	
	private static final String addEmplyee = "insert into Employee values (:id, :name, :address)";
	private static final String employeeById = "select id, name, address from employee where id =:id";
	private static final String deleteEmployeeById = "delete from employee where id =:id";
	private static final String updateEmployee = "update Employee set name =:name, address =:address where id =:id";
	private static final String getEmployees = "select id, name, address from Employee";
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public int addEmployee(Employee emp) {
		Map namedParameter = new HashMap();
		namedParameter.put("id", emp.getId());
		namedParameter.put("name", emp.getName());
		namedParameter.put("address", emp.getAddress());
		int status = namedParameterJdbcTemplate.update(addEmplyee, namedParameter);
		return status;
	}
	
	public int deleteEmployee(int id) {
		Map namedParameter = new HashMap();
		namedParameter.put("id",id);
		int status = namedParameterJdbcTemplate.update(deleteEmployeeById, namedParameter);
		return status;
	}
	
	public int updateEmployee(Employee emp) {
		Map namedParameter = new HashMap();
		namedParameter.put("id", emp.getId());
		namedParameter.put("name", emp.getName());
		namedParameter.put("address", emp.getAddress());
		int status = namedParameterJdbcTemplate.update(updateEmployee, namedParameter);
		return status;
	}
	
	public Employee getEmployeeById(int id) {
		Employee emp = null;
		try {
		Map namedParameter = new HashMap();
		namedParameter.put("id", id);
		emp =  (Employee) namedParameterJdbcTemplate.queryForObject(employeeById, namedParameter, (rs, rowNum) -> employeeMapper(rs));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return emp;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> employees = namedParameterJdbcTemplate.query(getEmployees, (rs, rowNum) -> employeeMapper(rs));
		return employees;
	}
	
	private List<Employee> employeesMapper(ResultSet rs) throws SQLException {
		List<Employee> employees = new ArrayList<>();
		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setAddress(rs.getString("address"));
		employees.add(emp);
		return employees;
	}
	
	private Employee employeeMapper(ResultSet rs) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt("id"));
		emp.setName(rs.getString("name"));
		emp.setAddress(rs.getString("address"));
		return emp;
	}

}
