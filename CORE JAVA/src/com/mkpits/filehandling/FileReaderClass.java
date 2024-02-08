package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("E:\\imp.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String data = "";
		
		while ((data = br.readLine()) != null) 
		{
			System.out.print(data + " ");
		}
		
		fr.close();

	}

}
