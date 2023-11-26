package com.pack1.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao 
{
	public static ResultSet getDao() throws ClassNotFoundException, SQLException {
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("SELECT * FROM HACKER");
		return pst.executeQuery();
	}
}
