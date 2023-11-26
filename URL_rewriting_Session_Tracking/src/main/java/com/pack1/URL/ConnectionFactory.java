package com.pack1.URL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
	public static Connection getconnection() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/workers";
		String user="root",pass="ROOT#30";
		return DriverManager.getConnection(url,user,pass);
	}
}
