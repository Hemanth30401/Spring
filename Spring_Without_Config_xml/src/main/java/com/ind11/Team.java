package com.ind11;

public class Team 
{
	
	
	private Players players; //constructor injection
	
	public Team(Players players) {
		super();
		this.players = players;
	}
	
	
	
	
	public void getTeam() {
		players.getPlayers();
		System.out.println("This is indian team");
	}
}
