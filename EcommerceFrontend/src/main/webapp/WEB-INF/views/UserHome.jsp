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

<%@include file="UsersHeader.jsp"%>

<div class="row">
<div class="col-sm-6 col-md-3">
<c:forEach items="${prodlist}" var="product"> 
<a href="ProductDesc/${product.prodid}" class="thumbnail">
<img src="<c:url value="/resources/images/${product.prodid}.jpg"/>" alt="Generic placeholder thumbnail"/>
</a>

<div class="caption">
<h4>${product.prodname}</h4>

<p>${product.price}</p>

</div>

</c:forEach>
</div>
</div>

</body>
</html>