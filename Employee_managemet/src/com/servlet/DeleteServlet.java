package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.userDAO;
import com.DB.DBConnection;

@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet

{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			int id = Integer.parseInt(req.getParameter("Employee_Id"));
			userDAO user = new userDAO(DBConnection.getConnection());
			boolean f =  user.delete(id);
			PrintWriter out = resp.getWriter();
			if(f) {
				//out.print("Data delete");
				resp.sendRedirect("Emp.jsp");
			}
			else {
				out.print("Data not delete");
				
			}
			
			
		}
}
