package com.mkpits.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private Student_Db_Util student_Db_Util;
	
	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;
	
	public void init() throws ServletException{
		super.init();
		
		//create our student db..util  and pass in the conn pool/datasource
		
		try {
			student_Db_Util = new Student_Db_Util(dataSource);
		} catch (Exception e) {
		throw new ServletException(e);
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		try {
			listStudents(request , response);
		} catch (Exception e) {
			throw new ServletException();
		}
	}
	
	private void listStudents (HttpServletRequest request , HttpServletResponse response) throws Exception{
		 //get student from db....util
		List<Student> students = student_Db_Util.getStudents();
		
		//add student to the request
		request.setAttribute("STUDENT_LIST", students);
		
		//send to jsp pages
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list_student.jsp");
		dispatcher.forward(request, response);
	}

}
