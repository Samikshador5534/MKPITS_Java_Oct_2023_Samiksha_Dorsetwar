package com.mkpits.reversed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reversed_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		getReversed();
		
		
	}
		public static  void getReversed() throws NumberFormatException, IOException {
			
		
		int reversed = 0;
		
		 BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
	     System.out.println("enter Number: ");
	 	int num = Integer.parseInt(BR.readLine());

	   
	    while(num != 0) 
	    {
	    
	      int digit = num % 10;
	      
	      reversed = reversed * 10 + digit;

	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	    
	  }
	
	}
