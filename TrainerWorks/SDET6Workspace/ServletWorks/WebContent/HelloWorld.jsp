<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 


<%!
// C:\Naveen Training\WorkGround\SDET6Workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\ServletWorks\org\apache\jsp
// this is one time 
	Date d1  = new Date();

public void _jspInit(){}
%>


	<h1> This is my First JSP</h1>
	
	<%
			// java code 
			
			Date date = new Date();
			out.print("Today date is " + date);
			out.print("<br> Date from Decl is " + d1);
	%>
	
</body>
</html>