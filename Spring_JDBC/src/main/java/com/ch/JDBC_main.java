package com.ch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBC_main {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("com/ch/Config.xml");
		JdbcTemplate t = c.getBean("JdbcTemplate",JdbcTemplate.class);
		String Query = "INSERT INTO HACKER VALUES(?,?,?,?)";
		int rows = t.update(Query,"Raj","98654345","123","Hyd");
		System.out.println(rows +" Rows Inserted Successfully" );
				
	}

}
