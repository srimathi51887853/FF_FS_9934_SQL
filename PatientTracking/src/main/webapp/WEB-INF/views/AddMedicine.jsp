<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Medicine details</title>
</head>
<body style="background-color:grey;">
<div align="center">
		<h1>Welcome to add medicine details</h1>
		<form:form action="AddMedicine" method="post" modelAttribute="medicine">
<table border=1>
				<tr>
					<td>Medicine Id</td>
					<td><input type="number" name="id" style="width: 120px"/><font color="red">
					</font>
					</td>
				</tr>
				<tr>
					<td>MedicineName</td>
					<td><form:input type="text" path="medicineName" style="width: 120px"/><font color="red">
					<form:errors path="medicineName"/></font>
					</td>
				</tr>
				<tr>
					<td>ExpiryDate</td>
					<td><input type="date" name="expirydate" style="width: 120px"/><font color="red">
					</font>
				</td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="number" name="price" style="width: 120px"/><font color="red">
					</font>
				</td>
				</tr>
			</table>

			<input type="submit" value="register">
</form:form>
	</div>
</body>
</html>