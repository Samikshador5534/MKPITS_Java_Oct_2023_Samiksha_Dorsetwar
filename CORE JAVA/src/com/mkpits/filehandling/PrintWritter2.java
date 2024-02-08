package com.mkpits.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritter2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PrintWriter writer = new PrintWriter(new FileWriter("E:\\imp.txt",true),true );
		
		writer.println("samyyyy.......");
		
		writer.close();
		
		writer.flush();
		
		
		
		
		
	}

}
