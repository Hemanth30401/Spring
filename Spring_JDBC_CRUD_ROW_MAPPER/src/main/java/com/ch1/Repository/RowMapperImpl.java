package com.ch1.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ch1.Entity.Employee;

public class RowMapperImpl implements RowMapper<Employee>
{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setEname(rs.getString(1));
		emp.setEid(rs.getInt(2));
		emp.setEgender(rs.getString(3));
		return emp;
	}
	
}
