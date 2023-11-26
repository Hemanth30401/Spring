package com.indafg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotations_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
		Player p = c.getBean("player",Player.class);
		System.out.println(p);
	}

}
