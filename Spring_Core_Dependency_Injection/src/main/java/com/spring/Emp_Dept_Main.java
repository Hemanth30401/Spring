package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Emp_Dept_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
		Dept d = c.getBean("dept",Dept.class);
		d.getDept();
	}

}
