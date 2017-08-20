<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registering</title>
</head>
<body>

     <%@ page import = "java.sql.*" %>
      <%@ page import = "java.io.*" %>
      <% response.setContentType("text/html"); %>
      <% String n=request.getParameter("userName"); %>
      <% String p=request.getParameter("userPass"); %>
      <% String e=request.getParameter("userEmail"); %>
      <% String c=request.getParameter("userCountry"); %>
      <% try{ %>
      <% Class.forName("org.h2.Driver"); %>
      <% Connection con =DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","@aakash"); %>
      <%  Statement stmt=con.createStatement(); %>
      <% int i=stmt.executeUpdate("insert into registeruser values('"+n+"','"+p+"','"+e+"','"+c+"')"); %>
      <% if(i==1){ out.println("You are successfully registered..."+n); %>
      <%  }else{out.println("User Not Registered");} %>
      <% }catch(Exception ex){ex.printStackTrace();} %>

</body>
</html>