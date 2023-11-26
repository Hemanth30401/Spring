package com.pack1.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateDao 
{
	public static ResultSet getData(String location) throws SQLException, ClassNotFoundException
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM HACKER WHERE LOCATION=?");
		pst.setString(1, location);
		return pst.executeQuery();
	}

}
