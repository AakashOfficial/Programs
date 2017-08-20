<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
      <form action="register" method="post">

     Name:<input type="text" name="userName"/><br/><br/>
     Password:<input type="password" name="userPass"/><br/><br/>
     Email Id:<input type="text" name="userEmail"/><br/><br/>
     Country:
      <select name="userCountry">
      <option>India</option>
      <option>Japan</option>
     
      </select>
     <input type="submit" value="register"/>
         <br/><br/>
      
      <br>
   
</form>
<a href="index.jsp">Home</a>
</body>
</html>