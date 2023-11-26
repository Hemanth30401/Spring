package com.spring;

public class Dept 
{
	public Employee emp;

	public Dept(Employee emp) {
		super();
		this.emp = emp;
	}

	public void getDept() {
		System.out.println("Department is Product Development");
		emp.getEmployees();
	}
	
}
