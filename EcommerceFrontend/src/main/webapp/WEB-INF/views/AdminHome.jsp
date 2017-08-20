<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="<c:url value="/resources/css/Head.css" />" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<%@include file="AdminHeader.jsp"%>
<html lang="en">
<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
   
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<section id="promo" class="promo section offset-header">
        <div class="container text-center">
        <br>
            <h2 class="title">MySite@Self.com<span class="highlight">ADMIN</span></h2>
            <p class="intro">Welcome to MySite@Self.com Admin Page</p>
            <br><br>
        </div><!--//container-->
    </section>
    <h1 align="center">Welcome Admin</h1>
  <input type="submit" value="Update Category" action="UpdateCategory"/>
  <input type="submit" value="Add Category" action="AddCategory"/></br>
  <input type="submit" value="Update Product" action="#"/>
  <input type="submit" value="Add Product" action="InsertProduct"/><br/>
  <input type="submit" value="Update User" action="#"/>
  <input type="submit" value="Add User" action="InsertUserRegister"/><br/>
   <%@include file="Footer.jsp"%>
</body>