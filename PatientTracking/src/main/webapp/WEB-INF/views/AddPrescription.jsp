<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prescription</title>
</head>
<body style="background-color:grey;">
<div align="center">
		<h1> Prescription details</h1>
		<form action="AddPrescription" method="post" modelAttribute="prescription">
<table border=1>
				<tr>
					<td>Prescription Id</td>
					<td><input type="number" name="id" style="width: 120px"/><font color="red">
					</font>
					</td>
				</tr>
				<tr>
					<td>MedicineId</td>
					<td><input type="text" name="medicineId" style="width: 120px"/><font color="red">
					</font>
					</td>
				</tr>
				<tr>
					<td>PatientName</td>
					<td><input type="text" name="patientName" style="width: 120px"/><font color="red">
					</font>
				</td>
				</tr>
				<tr>
					<td>Quantity</td>
					<td><input type="number" name="quantity" style="width: 120px"/><font color="red">
					</font>
				</td>
	</tr>
			</table>

			<input type="submit" value="Submit">
</form>
	</div>
</body>
</html>