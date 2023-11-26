package com.indafg;

import org.springframework.beans.factory.annotation.Value;

public class Player 
{
	private String name;
	private int number;
	private String email;
	
	@Value("${player.name}")
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("${player.number}")
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Value("${player.email}")
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", number=" + number + ", email=" + email + "]";
	}
	
	
}
