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

@WebServlet("/Data")
public class DataDis extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			ResultSet rs = Dao.getDao();
			out.println("<table>"
					+ "<th>Username</th>"
					+ "<th>Mobile</th>"
					+ "<th>Password</th>"
					+ "<th>Location</th>");
			while(rs.next())
			{
				out.println("<tr>"
						+ "<td>"+rs.getString(1)+"</td>"
						+ "<td>"+rs.getString(2)+"</td>"
						+ "<td>"+rs.getString(3)+"</td>"
						+ "<td>"+rs.getString(4)+"</td>"
						+ "<td><button><a href='Delete?location="+rs.getString(4)+"'>Delete</a></button></td>"
								+ "<td><button><a href='Update?location="+rs.getString(4)+"'>Update</a></button></td>"
								+ "</tr>");
			}
			out.println("</table>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
