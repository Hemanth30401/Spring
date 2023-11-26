package com.springdatatypes;

public class Admin 
{
	private String Aname;
	private int Aid;
	private String Alocation;
	Candidate cand;
	public Admin(String aname, int aid, String alocation, Candidate candidate) {
		super();
		Aname = aname;
		Aid = aid;
		Alocation = alocation;
		this.cand = candidate;
	}
	@Override
	public String toString() {
		return "Admin [Aname=" + Aname + ", Aid=" + Aid + ", Alocation=" + Alocation + ", cand=" + cand + "]";
	}
	
	public void init() {
		System.out.println("Admin init()");
	}
	public void destroy() {
		System.out.println("Admin destroy()");
	}
}
