<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PatientTracking</title>
</head>
<body style="background-color:grey;">

	<div align="center">
		<h1>Welcome to Login Page</h1>
		<form:form action="Login" method="post" modelAttribute="user">
		<form:hidden path="firstName" value="ani"/>
		<form:hidden path="lastName" value="suba"/>
		<form:hidden path="age" value="14"/>
		<form:hidden path="gender" value="female"/>
		<form:hidden path="PhoneNumber" value="123"/>
		<form:hidden path="roleId" value="4"/>
<table border=1>
				
				<tr>
					<td>EmailId</td>
					<td><form:input type="text" path="emailId" style="width: 120px"/>
					<font color="red"><form:errors path="emailId"/>
					</font>
					
		
							</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password" style="width: 120px"/>
					<font color="red"><form:errors path="password"/></font>
					
							</td>
				</tr>
				
			</table>
		<input type="submit" value="Login">
</form:form>
	</div>
</body>
</html>
