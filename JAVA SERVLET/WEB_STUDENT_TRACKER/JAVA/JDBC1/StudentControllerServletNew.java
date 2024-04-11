package com.mkpits.jdbc1;

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
@WebServlet("/StudentControllerServletNew")
public class StudentControllerServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	private Student_Db_Utilby student_Db_Util;
	
	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;
	
	public void init() throws ServletException{
		super.init();
		
		//create our student db..util  and pass in the conn pool/datasource
		
		try {
			student_Db_Util = new Student_Db_Utilby(dataSource);
		} catch (Exception e) {
		throw new ServletException(e);
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		try {
			//read the command parameter
			String theCommand = request.getParameter("command");
			
			//if the command is missing .then default to listing student
			
			if(theCommand == null) {
				theCommand = "LIST";
				
			
			}
			
			//ROUTE TO THE APPROPRIATE METHOD
			switch(theCommand) {
			case "LIST" : 
				listStudents(request , response);
				break;
			case "ADD" :
				addstudent(request ,response);
				break;
				default:
					
			}
			listStudents(request , response);
		} catch (Exception e) {
			throw new ServletException();
		}
	}
	
	private void addstudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//read student data from form
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		//create new student_model object
		Student_Model theStudent = new Student_Model(firstName, lastName, email);
		
		//add student to the database
		student_Db_Util.addStudent(theStudent);
		
		 //send back to main page (the student list)
		listStudents(request, response);
	}


	private void listStudents (HttpServletRequest request , HttpServletResponse response) throws Exception{
		 //get student from db....util
		List<Student_Model> students = student_Db_Util.getStudents();
		
		//add student to the request
		request.setAttribute("STUDENT_LIST", students);
		
		//send to jsp pages
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list_student-button.jsp");
		dispatcher.forward(request, response);
	}

}
