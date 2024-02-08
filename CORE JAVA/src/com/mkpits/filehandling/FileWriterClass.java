package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriterClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter data");
		String s = br.readLine();
		s = s + "\n";

		FileWriter fw = new FileWriter("E:\\imp.txt", true);
		fw.write(s);
		fw.close();
		
	}

}
