package com.springdatatypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class IoC_Spring_Main {

	public static void main(String[] args) 
	{
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Candidate c = (Candidate) context.getBean("candidate");
		Admin a = (Admin) context.getBean("admin");
		System.out.println(a);
		context.close();
	}

}
