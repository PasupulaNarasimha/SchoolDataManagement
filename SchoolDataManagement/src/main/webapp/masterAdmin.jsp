<%@page import="com.simha.schooldatamanagement.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Admin admin=(Admin)session.getAttribute("master");
if(admin!=null){
 %>
<h1>This is message from master Admin</h1>
<%} else{ %>
<h2>Login to access Master function</h2>
<a href="adminlogin.jsp">To Login As Admin</a> 
<%} %>
</body>
</html>