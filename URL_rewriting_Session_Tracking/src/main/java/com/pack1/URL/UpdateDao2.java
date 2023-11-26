package com.pack1.URL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDao2 
{
	public static int getUpdate(String userName,String mobile,String password,String location) throws ClassNotFoundException, SQLException 
	{
		Connection con = ConnectionFactory.getconnection();
		PreparedStatement pst = con.prepareStatement("UPDATE HACKER SET USERNAME=?,MOBILE=?,PASSWORD=? WHERE LOCATION=?");
		pst.setString(1,userName);
		pst.setString(2,mobile);
		pst.setString(3,password);
		pst.setString(4,location);
		return pst.executeUpdate();
	}
}
