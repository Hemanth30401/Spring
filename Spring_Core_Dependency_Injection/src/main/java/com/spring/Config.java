package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config 
{
	Employee emp = new Employee();
	
	@Bean("dept")
	public Dept isDept() {
		Dept d = new Dept(emp);
		return d;
	}
}
