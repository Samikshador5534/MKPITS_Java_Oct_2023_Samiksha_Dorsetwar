package com.mkpits.filehandling;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class File_OutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter data to be written");
		String str = BR.readLine();
		str = str + "\n";
		
		FileOutputStream fos = new FileOutputStream("D:\\MKPITS_WORKSPACE\\CoreJava_samiksha_dorsetwar\\ip.txt", true);
		byte[] b = str.getBytes();
		
		fos.write(b);
		fos.close();
		System.out.println("data written");
		
		
		
	}

}
