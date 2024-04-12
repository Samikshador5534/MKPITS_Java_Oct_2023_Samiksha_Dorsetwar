package com.mkpits.books;

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
//This annotation declares the servlet mapping, indicating that requests to "/StudentControllerServletNew" will be handled by this servlet.
@WebServlet("/BooksControllerServletNew")

public class BooksControllerServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;  // The serialVersionUID is a version control identifier for the class.

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//
	
	private Books_Db_Utility books_Db_Util;
	
	//@Resource: This is an annotation in Java that tells the program where to find a particular resource, in this case, a data source.
	//(name = "jdbc/web_student_tracker"): This part specifies the name of the resource we want to inject
	
	@Resource(name = "jdbc/web_books")
	
	//A DataSource is an object that allows us to connect to a database
	private DataSource dataSource;
	
	
	//The init() method is overridden from the superclass HttpServlet to perform initialization tasks when the servlet is first loaded
	public void init() throws ServletException{
		super.init();
		
		//create our student db..util  and pass in the conn pool/datasource
		
		try {
			books_Db_Util = new Books_Db_Utility(dataSource);
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
				listBooks(request, response);
				break;
			case "ADD" :
				addbooks(request ,response);
				break;
				default:
					listBooks(request, response);
			}
			listBooks(request , response);
		} catch (Exception e) {
			throw new ServletException();
		}
	}
	
	//This method handles adding a new student to the database based on the form data sent via the request.
	private void addbooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//read student data from form
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String date = request.getParameter("date");
		String genres = request.getParameter("genres");
		String characters = request.getParameter("characters");
		String synopsis = request.getParameter("synopsis");
		
		
		//create new student_model object
		Books_Model theBooks = new Books_Model( title, author, date, genres,characters, synopsis);
		
		//add student to the database
		books_Db_Util.addbooks(theBooks);//The new student is added to the database using the addStudent() method of the student_Db_Util object.

//java
		
		 //send back to main page (the student list)
		listBooks(request, response);
	}


	private void listBooks (HttpServletRequest request , HttpServletResponse response) throws Exception{
		 //get student from db....util
		//It fetches the list of students from the database using the getStudents() method of the student_Db_Util object.
		List<Books_Model> books = books_Db_Util.getBooks();
		
		//add student to the request
		//The list of students is set as an attribute in the request object with the name "STUDENT_LIST".
		request.setAttribute("STUDENT_LIST", books);
		
		//send to jsp pages
		//The request is then forwarded to the JSP page named "list_student-button.jsp", where the list of students will be displayed.
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-books-button.jsp");
		dispatcher.forward(request, response);
	}

}
