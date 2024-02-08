package com.mkpits.filehandling;


import java.io.PrintWriter;

public class PrintWritterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter pw = new PrintWriter(System.out , true);
		
		pw.println("good morning");
		
		pw.close();
		
		pw.flush();
		

		
	}

}
