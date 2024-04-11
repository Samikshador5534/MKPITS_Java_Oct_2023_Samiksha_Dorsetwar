package com.mkpits.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.PreparableStatement;



public class Student_Db_Utilby {

	private DataSource datasource;
	
	public Student_Db_Utilby(DataSource dataSource) {
		this.datasource = dataSource;
	}
	
	public List<Student_Model> getStudents() throws Exception{
		List<Student_Model> students = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = datasource.getConnection();
			
			//create sql statement
			String sql = "select * from student order by last_name";
			myStmt = myConn.createStatement();
			
			//excute sql query
			myRs = myStmt.executeQuery(sql);
			
			//process thr result set
			while(myRs.next()) {
				
				//retrive data from result set
				int id = myRs.getInt("id");
				String firstName = myRs.getString("first_name");
				String lastName = myRs.getString("last_name");
				String email = myRs.getString("email");
				
				//create new student object
				Student_Model tempStudent = new Student_Model(id,firstName,lastName,email);
				
				//add is it the list of student
				students.add(tempStudent);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			Close(myConn,myStmt,myRs);
		}
		return students;
	}
	
	private void Close(Connection myConn , Statement myStmt ,ResultSet myRs) {
		try {
			if(myRs != null) {
				myRs.close();
			}
			if(myStmt != null) {
				myStmt.close();
			}
			if(myConn != null) {
				myConn.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addStudent(Student_Model theStudent) {
		Connection myConn = null;
	    PreparedStatement myStmt = null;
	    
	    try {
	    	myConn = datasource.getConnection();
	    	
	    	//create sql for insert
	    	String sql = "insert into student(first_name,last_name,email) values(?,?,?)";
	        myStmt = myConn.prepareStatement(sql);
	        
	        //set the param values for the student
	        myStmt.setString(1, theStudent.getFirstName());
	        myStmt.setString(2, theStudent.getLastName());
	        myStmt.setString(3, theStudent.getEmail());
	        
	        //excute sql insert
	        myStmt.execute();
	        
	       
	        
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	    finally {
	    	Close(myConn,myStmt,null);
	    }
}
}