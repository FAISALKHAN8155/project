<%@page import="javax.xml.stream.Location"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Welcome </title>
</head>
<body>
<form style="text-align:center;"  >

<h1> Welcome dude!!! </h1>

 
  <input type="button" onclick="location.href='Update.jsp'" value="Update">
  <input type="button" value="Logout">
 <a href="Deleteservlet"> <input type="button"  value="Delete"> </a>
 
 
 
 </form>
 
           
</body>
</html>