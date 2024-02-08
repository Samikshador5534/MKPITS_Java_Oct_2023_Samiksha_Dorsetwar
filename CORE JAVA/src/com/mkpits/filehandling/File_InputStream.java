package com.mkpits.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class File_InputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//byte oriented
		//	byte-oriented classes accept arguments as a single byte
		//byte array or byte sub-array in case of Reading
		//	InputStream and OutputStream are abstract super classes for,Reading or Writing byte oriented data

		FileInputStream fis = new FileInputStream("D:\\MKPITS_WORKSPACE\\CoreJava_samiksha_dorsetwar\\ip.txt");
		
		int b = 0;
		
		while((b = fis.read() ) != -1)
			
        {
			System.out.print((char)b);
		}
		
		fis.close();
		
	}

}
