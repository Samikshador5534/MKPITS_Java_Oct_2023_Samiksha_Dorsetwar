package com.mkpits.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class test_servlet
 */
@WebServlet("/test_servlet")
public class test_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//define datasourse/connection pool for Resourse Injection
	@Resource(name = "jdbc/web_student_tracker")
	private DataSource datasource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		//set up the printer
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get coonection to the database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = datasource.getConnection();
			
			//create sql statement
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			//excute sql query
			
			myRs = myStmt.executeQuery(sql);
			
			//process result set
			while(myRs.next()) {
				String email = myRs.getString("email");
				out.println(email);
			}
				
				
				
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
