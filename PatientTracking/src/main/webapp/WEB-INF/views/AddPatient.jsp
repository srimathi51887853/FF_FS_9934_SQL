<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:grey;">
<div align="center">
		<h1>Add Patient Details</h1>
		<form action="AddPatient" method="post" modelAttribute="user">
<table border=1>
                 <tr>
					<td>PatientId</td>
					<td><input type="number" name="id" style="width: 120px"/><font color="red">
					</font>
					</td>
				</tr>
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="firstName" style="width: 120px"/><font color="red">
					</font>
					</td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lastName" style="width: 120px"/><font color="red">
					</font>
					</td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="number" name="age" style="width: 120px"/><font color="red">
					</font>
				</td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="text" name="gender" style="width: 120px"/><font color="red">
					</font>
				</td>
				</tr>
				
				<tr>
					<td>PhoneNumber</td>
					<td><input type="number" name="phoneNumber" style="width: 120px"/><font color="red">
					</font>
							</td>
				</tr>
					
			</table>

			<input type="submit" value="Submit">
</form>
	</div>
</body>
</html>
