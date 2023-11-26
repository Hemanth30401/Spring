package com.ch1.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ch1.Entity.Employee;

@Repository("DaoImpl")
public class DaoImpl implements Dao
{
	@Autowired
	private JdbcTemplate jt;
	
	public int insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String sql1 = "INSERT INTO EMPLOYEE VALUES(?,?,?)";
		return jt.update(sql1,emp.getEname(),emp.getEid(),emp.getEgender());
	}

	public Employee getOneEmployeeObject(int eid) {
		String sql2 = "SELECT * FROM EMPLOYEE WHERE EID=?";
		RowMapper<Employee> rm = new RowMapperImpl();
		return jt.queryForObject(sql2, rm,eid);
	}

	public List<Employee> getEmployees() {
		String sql3 = "SELECT * FROM EMPLOYEE";
		RowMapper<Employee> rm = new RowMapperImpl();
		return jt.query(sql3, rm);
	}
	

}
