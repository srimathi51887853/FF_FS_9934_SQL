<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Registration</title>
</head>
<body style="background-color:grey;">
	<div align="center">
	
		<h1>Welcome to Registration Page</h1>
		<form:form action="registration" method="post" modelAttribute="user">
<table border=1>
				<tr>
					<td>FirstName</td>
					<td><form:input type="text" path="firstName" style="width: 120px"/>
					<font color="red"><form:errors path="firstName"/></font>
					</td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><form:input type="text" path="lastName" style="width: 120px"/>
					<font color="red"><form:errors path="lastName"/>
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
					<td>EmailId</td>
					<td><form:input type="text" path="emailId" style="width: 120px"/>
					<font color="red"><form:errors path="emailId"/>
					</font>
							</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input type="password" path="password" style="width: 120px"/>
					<font color="red"><form:errors path="password"/>
					</font>
							</td>
				</tr>
				
				<tr>
					<td>PhoneNumber</td>
					<td><input type="number" name="phoneNumber" style="width: 120px"/><font color="red">
					</font>
							</td>
				</tr>
				<tr>
					<td>Role</td>
					<td><select name ="RoleId" id="roleId"
							style="width: 127px">
							<option value=1>USER</option>
							<option value=1>ADMIN</option>
							<option value=1>CLERK</option>
							<option value=2>DOCTOR</option>
							<option value=3>PATIENT</option>

						</select>
						</td>
				</tr>
			</table>

			<input type="submit" value="Register">

		</form:form>
	</div>
</body>
</html>