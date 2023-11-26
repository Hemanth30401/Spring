
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.*;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			ResultSet rs = Dao.getLogin(userName,password);
			if(rs.next())
			{
				//Created a session 
				HttpSession ses = request.getSession();
//				store the session
				ses.setAttribute("userName",userName);
				ses.setAttribute("password",password);
				
				//Cookie
//				Cookie c1 = new Cookie("userName",userName);
//				response.addCookie(c1);
//				Cookie c2 = new Cookie("password",password);
//				response.addCookie(c2);
				
				out.println(userName+ " "+ password);
				out.println("<a href='inbox.jsp'>INBOX</a>");
				out.println("<a href='sent.jsp'>SENT</a>");
				out.println("<a href='starred.jsp'>STARRED</a>");
				out.println("<a href='Logout'>LOGOUT</a>");
			}
			else
			{
				out.println("Please Try again");
			}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
