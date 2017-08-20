<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Us</title>
</head>
<body>
  
   <c:out value="Contact Us At"/>
   <br/>
   <c:out value="${'Email:19aakash33@gmail.com'}"/>
   <br/>
   <c:out value="${'Phone:9711216829 && 8744872986'}" /> 
   <br/>
   
<c:import var="data" url="http://localhost:8057/MavenJSTL/Outtag.jsp"/> 
<c:out value="${data}"/>
    <br/><br/>
  <a href="index.jsp"><input type="submit" name="cthb" value="Home"/></a>
  
</body>
</html>

