package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.userDAO;
import com.DB.DBConnection;
import com.utilies.Employee;


@WebServlet("/updateServlet")
public class UpdateEmployee extends HttpServlet

{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	 int id = Integer.parseInt(req.getParameter("Employee_Id"));
 		String name = req.getParameter("Employee_Name");
 		String email = req.getParameter("Employee_Email");
 		String address = req.getParameter("Employee_Address");
 		
 		Employee employee = new Employee();
 		employee.setId(id);
 		employee.setName(name);
 		employee.setEmil(email);
 		employee.setAddress(address);
// 		System.out.println(id);
// 		System.out.println(employee.getName());
 		
 		userDAO user = new userDAO(DBConnection.getConnection());
 		boolean f = user.update(employee);
 		PrintWriter out = resp.getWriter();
 		if(f) {
 			//out.print("Data Updated Successfully");
 			RequestDispatcher view=req.getRequestDispatcher("/Emp.jsp");
          	view.forward(req, resp);
// 			resp.sendRedirect("Emp.jsp");
 		}
 		else {
 			out.println("Data Update Failed");
 		}
 	}

    }
