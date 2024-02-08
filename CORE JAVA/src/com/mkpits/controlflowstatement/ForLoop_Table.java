package com.mkpits.controlflowstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoop_Table {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
  
		int table ;
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
	//	System.out.println("enter a number");
		int n = Integer.parseInt(reader.readLine());
		

		for (int i =1; i <= 10 ; i++)
		{
			table = i *n;
        	System.out.println( n+" * "+i+" = "+table);
		}
		
	}

}
