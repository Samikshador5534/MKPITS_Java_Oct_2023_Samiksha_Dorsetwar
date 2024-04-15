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
	public Books_Model loadBooks(String theBooksId) {
		Books_Model theBooks = null;
		Connection myConn = null;
		PreparedStatement myStmt = null;
		ResultSet myRs = null;
		int booksId;

		try {
			// convert student id into integer
			booksId = Integer.parseInt(theBooksId);

			// get database connection
			myConn = datasource.getConnection();

			// create sql to get selected student
			String sql = "select * from books where id = ?";

			// create a prepared statement
			myStmt = myConn.prepareStatement(sql);

			// set params
			myStmt.setInt(1, booksId);

			// execute statement
			myRs = myStmt.executeQuery();

			// retrive data from result set row
			if (myRs.next()) {
				String title = myRs.getString("title");
				String author = myRs.getString("author");
				String date = myRs.getString("date");
				String genres = myRs.getString("genres");
				String characters = myRs.getString("characters");
				String synopsis = myRs.getString("synopsis");

				// use the studentid during constrction
				theBooks = new Books_Model(booksId, title, author, date, genres, characters, synopsis);
			} else {
				throw new Exception("Could not find booksid " + booksId);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Close(myConn, myStmt, myRs);
		}

		return theBooks;
	}
	


public void updateBooks(Books_Model theBooks) throws Exception {

	Connection myConn = null;
	PreparedStatement myStmt = null;
	try {

		// get db connection

		myConn = datasource.getConnection();

		// create sql to get update student
		String sql = "update books set title = ?,author = ?,date = ? ,genres = ? ,characters = ? ,synopsis = ?  where id = ?";

		// create a prepared statement
		myStmt = myConn.prepareStatement(sql);

		// set params
		
		myStmt.setString(1, theBooks.getTitle());   		
		myStmt.setString(2, theBooks.getAuthor());
		myStmt.setString(3, theBooks.getDate());
		myStmt.setString(4, theBooks.getGenres());
		myStmt.setString(5, theBooks.getCharacters());
		myStmt.setString(6, theBooks.getSynopsis());
		myStmt.setInt(7, theBooks.getId());

		// execute SQL statement
		myStmt.execute();

	} finally {
		Close(myConn, myStmt, null);
	}

}
public void deleteBooks(String booksId) throws Exception {
	Connection myConn = null;
	PreparedStatement myStmt = null;
	try {
		// convert student to integer
		int theBooksId = Integer.parseInt(booksId);

		// get db connection

		myConn = datasource.getConnection();

		// create sql to get update student
		String sql = "delete from books where id = ?";

		// create a prepared statement
		myStmt = myConn.prepareStatement(sql);
		
		//set params
		myStmt.setInt(1, theBooksId);
		
		//execute sql
		myStmt.execute();
	} finally {
		Close(myConn, myStmt, null);
	}

}
}