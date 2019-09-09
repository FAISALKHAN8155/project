<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="signup.css" type="text/css">
<title> Sign up </title>
</head>
<body>

        <form action="signupservlet" method="get">
            <h2> Registration Form </h2>
            <fieldset>
            <legend> Personal Details: </legend> </br>
            First name:
            <input type="text" name="firstname"class="txt" placeholder="enter your name" reqiured> </br> </br>
           
            last name: 
            <input type="text" name="lastname" class="txt" placeholder=" enter your last name" required> </br> </br>
               
            Email-id: 
            <input type="text" name="email" class="txt" placeholder="e-mail" required> </br> </br>
                        
            password:
            <input type="text" name="password" class="txt" placeholder="New password" required> </br> </br>
          
            re-password: 
            <input type="text" name="repassword" class="txt" placeholder="re-password" required> </br> </br>
            
            contact: 
            <input type="number" name="contact" class="txt" placeholder="Phone no." required> </br> </br>
            
            
            <input type="submit" value="signup"/>
            
            </fieldset>
            
        </form>

</body>
</html>