package com.mkpits.filehandling;

import java.io.File;

public class FileDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myFile = new File("D:\\MKPITS_WORKSPACE\\Basics_Java");
		
		String[] str = myFile.list();
		
		for (int i = 0; i < str.length; i++)
		{
			File myFile2 = new File(myFile,str[i]);
			
			if(myFile2.isDirectory())
			{
				System.out.println(myFile2.getName() + " is directory");
			}
			
			else if (myFile2.isFile())
			{
				System.out.println(myFile2.getName() + " is file");
			}
		}
		
	}

}
