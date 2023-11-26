package com.pack1.URL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDao 
{
	public static int getData(String location) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/workers";
		String user="root",pass="ROOT#30";
		Connection con = DriverManager.getConnection(url,user,pass);
		PreparedStatement pst = con.prepareStatement("DELETE FROM HACKER WHERE LOCATION=?");
		pst.setString(1,location);
		return pst.executeUpdate();
	}
}
