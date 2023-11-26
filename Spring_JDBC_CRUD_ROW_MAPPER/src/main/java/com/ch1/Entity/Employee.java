package com.ch1.Entity;

public class Employee
{
	private String Ename;
	private int eid;
	private String Egender;
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) 
	{
		Ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEgender() {
		return Egender;
	}
	public void setEgender(String egender) {
		Egender = egender;
	}
	
	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + ", eid=" + eid + ", Egender=" + Egender + "]";
	}
	
}
