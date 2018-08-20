<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- Add support for Spring MVC Form Tags -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
<title>Save Customer</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<h3>Save Customer</h3>
		
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
		<!-- Need to associate this data with customer ID -->
		<form:hidden path="id" /> <!-- without this line you'd add new items/duplicate things -->
			<table>
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input class="save" type="submit" value="Save"/></td>
					</tr>
				</tbody>
			</table>
			<div style="clear; both;"></div>
			<p>
				<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>
			</p>
		</form:form>
	</div>
</body>
</html>