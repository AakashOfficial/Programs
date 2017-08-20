<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
 <form action="loginServlet" method="get">
   User ID<input type="text" name="userID"/><br>
   Password<input type="text" name="password"/><br>
   <input type="submit" name="Submit" value="Submit"/>
  </form>
  <a  href="index.jsp">Home</a>
</body>
</html>