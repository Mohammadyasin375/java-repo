package com.spring.main.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.main.model.Employee;

@Component
public class EmployeeDB {

	private NamedParameterJdbcTemplate jdbc; //for query execution
	
	private DataSource dataSource; //est. conn to DB

	@Autowired
	public void setDataSource(DataSource dataSource) {
		 jdbc = new NamedParameterJdbcTemplate
				 (dataSource);
	}

	public List<Employee> fetchAllEmployees() {
		String sql="select * from employee";
		return jdbc.query(sql, new A()); 
	}
}

class A implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rst, int rowNum) throws SQLException {
		 Employee e=new Employee(); 
		 e.setId(rst.getInt("id"));
		 e.setName(rst.getString("name"));
		 e.setCity(rst.getString("city"));
		 e.setSalary(rst.getDouble("salary"));
		 
		return e;
	}
	
}
