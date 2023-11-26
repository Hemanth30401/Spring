package com.india;

import org.springframework.stereotype.Component;

@Component("manager")
public class Manager 
{
//	public void getList() {
//		System.out.println("I m manager");
//	}
	private String name;
	public Manager() {
		name="Mitron";
	}
	
	public String toString() {
		return name;
	}
}
