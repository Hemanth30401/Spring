package com.mh.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee 
{
	private String Ename;
	
	@Id
	private int Eid;
	private String Egender;
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEgender() {
		return Egender;
	}
	public void setEgender(String egender) {
		Egender = egender;
	}
	
	
	
	
	
}
