<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>
<table cellspacing="3" align="center">

<tr bgcolor="pink">
<td>Product Name</td>
<td>Quantity</td>
<td>SubTotal</td>
<td>Image</td>
<td>Operation</td>
</tr>

<c:forEach items="${cartitems}" var="cartitem">
<tr>
<form action="<c:url value="/updateCartItem/${cartitem.citemid}"/>" method="get">
<td>${cartitem.prodname}</td>
<td><input type="text" value="${cartitem.quantity}" name="quantity" required/> </td>

<td>${cartitem.price*cartitem.quantity}</td>
<td><img src="<c:url value='/resources/images/${cartitem.prodid }.jpg'/> width="100" height="100">/></td>
<td>
<input type="submit" value="UPDATE" class="btn-success btn-block"/>
<a href="<c:url value="/deleteCartItem/${cartitem.citemid}"/>" method="get">DELETE</a>
</td>
</form>
</tr>

</c:forEach>
<tr>
<td><a href="ProductPage">ContinueShopping</a></td>
<td><a href="<c:url value="/CheckOut"/>">CheckOut</a></td>
</tr>


</table>

</body>
</html>
