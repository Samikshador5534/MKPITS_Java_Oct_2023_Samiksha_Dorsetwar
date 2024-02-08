package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	static FileReader fr;
	public static void main(String[] args) {

        try {
			fr = new FileReader("E:\\imp.txt");
		    BufferedReader br = new BufferedReader(fr);
		    String data = "";
			while ((data = br.readLine()) != null) 
			{
				System.out.print(data + " ");
			}
		} catch (IOException e) 
        {
		  e.printStackTrace();
		}finally {
		
		try {
			fr.close();
			System.out.println("file closed");
		} catch (IOException e) {
			e.printStackTrace();
		   }

	   }
   }

}

	


