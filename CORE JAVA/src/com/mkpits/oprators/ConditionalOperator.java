package com.mkpits.oprators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConditionalOperator {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
          
      
		
		System.out.println("enter number ");
		int a = Integer.parseInt(BR.readLine());
		
		System.out.println("enter number ");
		int b = Integer.parseInt(BR.readLine());
		
		System.out.println("enter number");
		int c = Integer.parseInt(BR.readLine());
		
		System.out.println((a>b) ?"a is greater" : "b is greater" );
		//String c = (a>b)?"a is greater" : "b is greater";
		
		
	}

}
