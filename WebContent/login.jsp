<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="loginservlet" method="post" style="text-align:center"> 
            <h2> Please enter your registration Id or Password </h2>
            <fieldset>
            <legend> Sign in: </legend> <br>
             Email-Id : 
            <input type="text" name="Email" class="txt7" placeholder="enter your Resgistration Id" required> </br> </br>
            
             Password : 
            <input type="password" name="Password" class="txt8" placeholder="enter your Password"required> <br> </br>
            
            <input type="submit" value="login">
            <input type="reset" value="reset">
            
            <h4> New User? <a href="signup.jsp" style="text-decoration: none;"> Sign up </a> </h4>
            </fieldset>
     
 </form> 
</body>
</html>