package com.mkpits.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> no = new ArrayList<Integer>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how much data u want to enter");
		
		try {
			int data = Integer.parseInt(reader.readLine()); 
		    for (int i = 0; i < data; i++) {
			System.out.println("Enter values");
			int n =Integer.parseInt(reader.readLine());
			no.add(n);
		}
		}catch(Exception e) {
    	   e.printStackTrace();
       }
		 
		
		System.out.println(no);
		
		System.out.println("First element of the list is :"+ no.get(0));
		
		
		System.out.println("Last element of the list is :"+ no.get(no.size() - 1));
	}

}
