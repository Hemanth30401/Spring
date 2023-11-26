package com.india;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Annoations_Main 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
		Employee emp = context.getBean("employee",Employee.class);
		Manager man = context.getBean("Saturn",Manager.class);
		System.out.println(emp.getEname());
		System.out.println(emp.getManager());
		System.out.println(man);
	}
}
