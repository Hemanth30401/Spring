package com.ch1.Repository;

import java.util.List;

import com.ch1.Entity.Employee;

public interface Dao 
{
	public int insertEmployee(Employee emp);
	
	public Employee getOneEmployeeObject(int eid);
	
	public List<Employee> getEmployees();
}
