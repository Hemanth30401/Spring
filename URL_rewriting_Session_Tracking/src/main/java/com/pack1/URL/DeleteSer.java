package com.pack1.URL;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Delete")
public class DeleteSer extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String location = request.getParameter("location");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			int rows=DeleteDao.getData(location);
			if(rows>0) {
				RequestDispatcher rd = request.getRequestDispatcher("Data");
				rd.forward(request, response);
				
			}
			else {
				out.println("Please try again");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
