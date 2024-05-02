package com.mkpits.login;

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


import com.mkpits.login.RegistrationDbUtility;

/**
 * Servlet implementation class RegistrationControllerServlet
 */
@WebServlet("/RegistrationControllerServlet")
public class RegistrationControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
private  RegistrationDbUtility registrationDbUtility;
	
	
	
	@Resource(name = "jdbc/registration")
	
	//A DataSource is an object that allows us to connect to a database
	private DataSource dataSource;
	
	
	//The init() method is overridden from the superclass HttpServlet to perform initialization tasks when the servlet is first loaded
	public void init() throws ServletException{
		super.init();
		
		//create our  books db..util  and pass in the conn pool/datasource
		
		try {
			registrationDbUtility = new RegistrationDbUtility(dataSource);
		} catch (Exception e) {
		throw new ServletException(e);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		adddata(request, response);
}

	

	private void adddata(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		long mobile = Long.parseLong(request.getParameter("mobile"));
		String password = request.getParameter("password");
		String confmpassword = request.getParameter("confmpassword");
		
		
		//create new books_model object
		Registration_Model theuser = new Registration_Model( name, email, gender,city, mobile,password, confmpassword);
		
		//add books to the database
		registrationDbUtility.adddata(theuser);


		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
	
		
		
	}
}
