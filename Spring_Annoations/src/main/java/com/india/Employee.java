package com.india;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee 
{
	private String Ename;
	@Autowired
	Manager manager;
	
//	public void getManage() {
//		manager.getList();
//	}
	@Bean("Saturn")
	public Manager getManager() {
		Manager m = new Manager();
		return m;
	}
	
	
	
	
	public String getEname() {
		return Ename;
	}

	@Value("Hemanth")
	public void setEname(String ename) {
		Ename = ename;
	}
}
