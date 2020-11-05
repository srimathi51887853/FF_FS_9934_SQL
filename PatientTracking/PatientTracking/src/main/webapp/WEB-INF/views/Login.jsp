<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PatientTracking</title>
</head>
<body>
<body>
	<div align="center">
		<h1>Welcome to Login Page</h1>
		<form action="Login" method="post" modelAttribute="user">
<table border=1>
				
				<tr>
					<td>EmailId</td>
					<td><input type="text" name="emailId" style="width: 120px"/><font color="red">
					</font>
							</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" style="width: 120px"/><font color="red">
					</font>
							</td>
				</tr>
				
			</table>
		<input type="submit" value="login">
</form>
	</div>
</body>
</html>
