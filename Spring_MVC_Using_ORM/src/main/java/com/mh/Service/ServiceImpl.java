package com.mh.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mh.Dao.DaoInterface;
import com.mh.Entity.Employee;


public class ServiceImpl implements ServiceInterface
{
	@Autowired
	DaoInterface daoInterface;
	
	public DaoInterface getDaoInterface() {
		return daoInterface;
	}

	public void setDaoInterface(DaoInterface daoInterface) {
		this.daoInterface = daoInterface;
	}


	public void insertS(Employee emp) {
		// TODO Auto-generated method stub
		daoInterface.insert(emp);
	}

	public Boolean loginS(int id) {
		// TODO Auto-generated method stub
		return daoInterface.login(id);
	}
	
	

}
