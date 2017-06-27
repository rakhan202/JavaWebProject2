<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date" %>

<html>
<head>
<title>JSP Example</title>
</head>
<body>
	<h1>JSP Example</h1>
	<% Date d = new Date(); %>
	Today' Date <%= d %>
	<br>
	<% for (int i = 1; i<=10; i++) { %>
		<font color = blue><%= i %></font> <br>
	<% } %>
</body>
</html>
