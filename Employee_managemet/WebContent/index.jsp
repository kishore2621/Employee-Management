<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/style.css">
</head>
<body>

	<div class="container">
		<form action="AddEmployee" method="post">
		<table>
		<tr>
                    <th>Employee Id</th>
                    <td><input type="text" name="Employee_Id"></td>
                </tr>
                <tr>
                    <th>Employee Name</th>
                    <td><input type="text" name="Employee_Name"></td>
                </tr>
                <tr>
                    <th>Employee Email</th>
                    <td><input type="text" name="Employee_Email"></td>
                </tr>
                <tr>
                    <th>Employee Address</th>
                    <td><input type="text" name="Employee_Address"></td>
                </tr>
                <tr>
                    <td style="column-span: 1;"><input type="Submit" value="Submit" class="btn"></td>
                    <td><a href="Emp.jsp" class="show">Show Data</a></td>
                </tr>
		</table>
		</form>
	
	
	</div>
</body>
</html>