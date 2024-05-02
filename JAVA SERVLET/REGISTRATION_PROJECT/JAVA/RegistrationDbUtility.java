package com.mkpits.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.Statement;

public class RegistrationDbUtility {

	
	private DataSource dataSource;
	
      public RegistrationDbUtility( DataSource dataSource) { 
		this.dataSource = dataSource;
	}
	
	public void adddata(Registration_Model theuser) {
		
		Connection myConn = null;
		PreparedStatement myStmt = null;
		
		try {
			// get db connection
			myConn = dataSource.getConnection();

						// create sql for insert
						String sql = "insert into registration_Details(name,email,gender,city,mobile,password,cpassword) values(?,?,?,?,?,?,?)";
						myStmt = myConn.prepareStatement(sql);

						// set the param values for the student
						myStmt.setString(1, theuser.getName());
						myStmt.setString(2, theuser.getEmail());
						myStmt.setString(3, theuser.getGender());
						myStmt.setString(4, theuser.getCity());
						myStmt.setLong(5, theuser.getMobile());
						myStmt.setString(6, theuser.getPassword());
						myStmt.setString(7, theuser.getCnfmpassword());


						// execute SQL insert
						myStmt.execute();
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						close(myConn, myStmt, null);
					}
	}

	private void close(Connection myConn, PreparedStatement myStmt, ResultSet myRs) {
		try {
			
			if(myRs != null) {
				myRs.close();
			}if(myStmt != null) {
				myStmt.close();
			}
			if(myConn != null) {
				myConn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
