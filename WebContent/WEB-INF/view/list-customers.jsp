<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
	<title>List Customers</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
			<input class="add-button" type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;"/>
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="customer" items="${customers}">
					<!-- construct an "update" link with the customer id -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${customer.id }"/>
					</c:url>
					<c:url var="deleteLink" value="/customer/deleteCustomer">
						<c:param name="customerId" value="${customer.id}"/>
					</c:url>
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<!-- display the update link -->
						<td><a href="${updateLink}">Update</a>|<a href="${deleteLink}">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
	
</body>
</html>