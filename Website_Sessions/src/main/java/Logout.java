

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession(false);
		String userName = (String)request.getAttribute("userName");
		String password = (String)request.getAttribute("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ses.removeAttribute(userName);
		ses.removeAttribute(password);
		ses.invalidate();
		out.println("Logged off");
		out.println("<a href='index.jsp'>LOGIN</a>");
		
	}

}
