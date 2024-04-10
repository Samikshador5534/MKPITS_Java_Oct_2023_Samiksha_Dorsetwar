package com.mkpits.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



public class Student_Db_Util {

	private DataSource datasource;
	
	public Student_Db_Util(DataSource dataSource) {
		this.datasource = dataSource;
	}
	
	public List<Student> getStudents() throws Exception{
		List<Student> students = new ArrayList<>();
		
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
				Student tempStudent = new Student(id,firstName,lastName,email);
				
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
}
