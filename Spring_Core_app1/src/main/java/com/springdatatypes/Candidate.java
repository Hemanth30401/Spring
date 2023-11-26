package com.springdatatypes;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Candidate 
{
	private String Cname;
	private int Cid;
	private List<Integer> marks;
	private Map<Integer,String> Clocation;
	Properties Data;
	public Candidate(String cname, int cid, List<Integer> marks, Map<Integer, String> clocation, Properties data) {
		super();
		Cname = cname;
		Cid = cid;
		this.marks = marks;
		Clocation = clocation;
		Data = data;
	}
	@Override
	public String toString() {
		return "Candidate [Cname=" + Cname + ", Cid=" + Cid + ", marks=" + marks + ", Clocation=" + Clocation
				+ ", Data=" + Data + "]";
	}
	public void init() {
		System.out.println("Candidate init()");
	}
	public void destroy() {
		System.out.println("Candidate destroy()");
	}
	
	
	
}
