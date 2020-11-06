<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PatientTracking</title>
</head>
<body>
<body>
	<div align="center">
		<h1>Welcome to Login Page</h1>
		<form:form action="Login" method="post" modelAttribute="user">
<table border=1>
				
				<tr>
					<td>EmailId</td>
					<td><form:input type="text" path="emailId" style="width: 120px"/>
					<font color="red"><form:errors path="emailId"/></font>
					
		
							</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" style="width: 120px"/>
					<font color="red"><form:errors path="password"/></font>
					
							</td>
				</tr>
				
			</table>
		<input type="submit" value="login">
</form:form>
	</div>
</body>
</html>
