package com.pack1.URL;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update")
public class UpdateServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String location = req.getParameter("location");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			ResultSet rs = UpdateDao.getData(location);
			while(rs.next())
				out.println("<h3>Updation Process</h3>"
						+ "<form action='edit' method='get'>"
						+ "<table border style='border-collapse:collapse'>"
						+ "<tr><td>USERNAME:</td><td><input type='text' name='userName' value="+rs.getString(1)+"></td></tr>"
						+ "<tr><td>MOBLIE:</td><td><input type='text' name='mobile' value="+rs.getString(2)+"></td></tr>"
						+ "<tr><td>PASSWORD:</td><td><input type='text' name='password' value="+rs.getString(3)+"></td></tr>"
						+ "<tr><td>LOCATION:</td><td><input type='text' name='location' value="+rs.getString(4)+"></td></tr>"
								+ "<tr><td><input type='submit' value='Update'></td><td><input type='reset' value='Cancel'></td></tr></table></form>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
