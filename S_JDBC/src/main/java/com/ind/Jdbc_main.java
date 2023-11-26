package com.ind;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Jdbc_main {

	public static void main(String[] args) throws SQLException 
	{
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("path.xml");
		Team t = (Team)context.getBean("team");
		t.getTeamList();
		t.getUpdatedSList("India",10);
		context.registerShutdownHook();
	}

}
