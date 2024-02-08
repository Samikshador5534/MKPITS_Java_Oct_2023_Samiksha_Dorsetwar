package com.mkpits.controlflowstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

  
public class ForLoop {

	 static BufferedReader BR;
	 static int fact =1;
	 public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
         
		 BR = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Enter The Number");
		int n = Integer.parseInt(BR.readLine());
		
		for (int i = n ; i>=1;i--) {
			fact*=i*1;
			//System.out.println("Fctorial no is :-"+fact);
			
		}
		
		System.out.println("Fctorial no is :-"+fact);
			
		}
	}


