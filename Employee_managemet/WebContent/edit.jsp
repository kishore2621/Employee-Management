<%@page import="com.DAO.userDAO" %>
<%@page import="com.DB.DBConnection" %>
<%@page import="com.utilies.Employee" %>


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
 <form action="updateServlet" method="post" >
            <h2>Edit Employee Details</h2>
            <table>            
            <%
             	int id = Integer.parseInt(request.getParameter("id"));
            	userDAO user = new userDAO(DBConnection.getConnection());
            	Employee emp = user.getDataById(id);
            %> 
                <tr>
                    <th>Employee Id</th>
                    <td><input type="text"  name="Employee_Id" value="<%=emp.getId() %>"></td>
                </tr>
                <tr>
                    <th>Employee Name</th>
                    <td><input type="text" name="Employee_Name" value="<%=emp.getName() %> "></td>
                </tr>
                <tr>
                    <th>Employee Email</th>
                    <td><input type="text" name="Employee_Email" value="  <%=emp.getEmil() %> "></td>
                </tr>
                <tr>
                    <th>Employee Address</th>
                    <td><input type="text" name="Employee_Address" value="  <%=emp.getAddress() %> "></td>
                </tr>
                <tr>
                    <td style="column-span: 1;"><input type="Submit" value="Edit" class="btn"></td>
                    <td><a href="Emp.jsp" class="show">Show Data</a></td>
                </tr>
            </table>
            
        </form>
    </div>

</body>
</html>