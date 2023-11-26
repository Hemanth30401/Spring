<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String userName = (String)session.getAttribute("userName");
		String password = (String)session.getAttribute("password");
		out.println("I show starred messages " + userName + " " + password);
	%>
	<a href="inbox.jsp">INBOX</a>
	<a href="sent.jsp">SENT</a>
	<a href="Logout">LOGOUT</a>
</body>
</html>