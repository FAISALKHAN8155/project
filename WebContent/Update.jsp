<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Update </title>
</head>
<body>

 <form action="upsignservlet" method="get" style="text-align: center;">
            <h2>  </h2>
            <fieldset>
            <legend> Update here: </legend> </br>
            First name:
            <input type="text" name="firstname"class="txt" placeholder="enter your name" reqiured> </br> </br>
           
            last name: 
            <input type="text" name="lastname" class="txt" placeholder=" enter your last name" required> </br> </br>
            
            Email: 
            <input type="text" name="email" class="txt" placeholder=" enter your last name" required> </br> </br>
                        
            password:
            <input type="text" name="password" class="txt" placeholder="New password" required> </br> </br>
          
            re-password: 
            <input type="text" name="repassword" class="txt" placeholder="re-password" required> </br> </br>
            
            contact: 
            <input type="number" name="contact" class="txt" placeholder="Phone no." required> </br> </br> 
            
            <input type="Submit"  value="Update"/>
            
            </fieldset>
            
        </form>

</body>
</html>