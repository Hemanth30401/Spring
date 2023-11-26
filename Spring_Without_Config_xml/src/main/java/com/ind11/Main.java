package com.ind11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
		Team t = c.getBean("team",Team.class);
		t.getTeam();
	}
}
