package com.mkpits.books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



public class Books_Db_Utility {

	private DataSource datasource;
	
	public Books_Db_Utility(DataSource dataSource) {
		this.datasource = dataSource;
	}
	
	public List<Books_Model> getBooks() throws Exception{
		List<Books_Model> books = new ArrayList<>();
		
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = datasource.getConnection();
			
			//create sql statement
			String sql = "select * from books order by id";
			myStmt = myConn.createStatement();
			
			//excute sql query
			myRs = myStmt.executeQuery(sql);
			
			//process the result set
			while(myRs.next()) {
				
				//retrive data from result set
				int id = myRs.getInt("id");
				String title = myRs.getString("title");
				String author = myRs.getString("author");
				String date = myRs.getString("date");
				String genres = myRs.getString("genres");
				String characters = myRs.getString("characters");
				String synopsis = myRs.getString("synopsis");
				
				//create new student object
				Books_Model tempBooks = new Books_Model(id,title,author,date, genres, characters, synopsis);
				
				//add is it the list of student
				books.add(tempBooks);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			Close(myConn,myStmt,myRs);
		}
		return books;
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

	public void addbooks(Books_Model theBooks) {
		Connection myConn = null;
	    PreparedStatement myStmt = null;
	    
	    try {
	    	myConn = datasource.getConnection();
	    	
	    	//create sql for insert
	    	String sql = "insert into books(title,author,date,genres,characters,synopsis) values(?,?,?,?,?,?)";
	        myStmt = myConn.prepareStatement(sql);
	        
	        //set the param values for the student
	      
	        myStmt.setString(1, theBooks.getTitle());
	        myStmt.setString(2, theBooks.getAuthor());
	        myStmt.setString(3, theBooks.getDate());
	        myStmt.setString(4, theBooks.getGenres());
	        myStmt.setString(5, theBooks.getCharacters());
	        myStmt.setString(6, theBooks.getSynopsis());
	        
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