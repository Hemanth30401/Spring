package com.pack1.URL;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName = request.getParameter("userName");
		String mobile=request.getParameter("mobile");
		String password=request.getParameter("password");
		String location = request.getParameter("location");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			int rows = UpdateDao2.getUpdate(userName, mobile, password, location);
			if(rows>0)
			{
//				out.println("Updated Successfully");
				response.sendRedirect("Data");
			}
			else
				out.println("Please try again");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
