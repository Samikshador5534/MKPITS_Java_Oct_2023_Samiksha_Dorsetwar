package com.mkpits.automorphicnumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Automorphic_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		 BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the  square number ");
		int n = Integer.parseInt(BR.readLine());
		

		
 
		int square = n*n;
		System.out.println("square no  :-"+ square);
		
	
		if(n %10 != square %10) 
		{
		System.out.println("not automorphic no"); 
		return;
		}
	    n /=10;

	   square /= 10;
	
	
	   System.out.println("automorphic no");
	   
	  
}
		
}
	

