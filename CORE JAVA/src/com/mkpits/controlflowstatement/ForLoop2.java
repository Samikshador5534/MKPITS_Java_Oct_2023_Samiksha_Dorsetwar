package com.mkpits.controlflowstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoop2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
          int s = 1;
		 
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("enter a number");
		int n = Integer.parseInt(reader.readLine());
		
		for (int i =1; i <= n ; i++)
		 {
			
			s +=i;
			
		}
		System.out.println(s);
	}

}
