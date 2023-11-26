package com.mh.Dao;

import com.mh.Entity.Employee;

public interface DaoInterface 
{
	public void insert(Employee emp);
	public Boolean login(int id);
}
