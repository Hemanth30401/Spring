package com.ind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Team 
{
	private String driver;
	private String url;
	private String userName;
	private String password;
	
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	Connection con;
	public void getconnection() throws SQLException, ClassNotFoundException 
	{
		Class.forName(driver);
		con=DriverManager.getConnection(url,userName,password);
	}
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		getconnection();
	}

	public void closeConnection() throws SQLException {
		con.close();
	}
	
	@PreDestroy
	public void destroy() throws SQLException {
		closeConnection();
	}
	
	public void getTeamList() throws SQLException 
	{
		PreparedStatement pst = con.prepareStatement("SELECT * FROM TEAMS");
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getInt(1) + "\t");
			System.out.print(rs.getString(2) + "\t");
			System.out.print(rs.getInt(3) + "\t");
			System.out.println();
		}
	}
	
	public void getUpdatedSList(String team_Name,int points) throws SQLException 
	{
		PreparedStatement pst = con.prepareStatement("UPDATE TEAMS SET TEAM_NAME=? WHERE POINTS=?");
		pst.setString(1,team_Name);
		pst.setInt(2,points);
		int rows = pst.executeUpdate();
		System.out.println(rows + "row updated successfully");
		
	}
	
	

}
