<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>
<table cellspacing="3" align="center">
<tr>
<td colspan="5"><center><h3>Shopping Cart</h3></center></td>
</tr>
<tr bgcolor="pink">
<td>Product ID</td>
<td>Quantity</td>
<td>SubTotal</td>
<td>Image</td>
<td>Operation</td>
</tr>

<c:forEach items="${cartitems}" var="cartitem">
<tr>
<td>${cartitem.prodname}</td>
 <td>${cartitem.quantity}</td>
 <td><img src="<c:url value="/resources/images/${cartitem.prodid }.jpg" width="100" height="100" />"/></td>
 <td>${cartitem.price * cartitem.quantity}</td>

 
 
</tr>

</c:forEach>
<tr>
<td colspan="3"> Grand Total</td>
<td>${grandtotal}</td> 
</tr>


</table>

</body>
</html>
