package com.mkpits.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListUsingBufferedReader {

	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how much data u want to enter");
		

		try {
			int data = Integer.parseInt(reader.readLine()); 
		    for (int i = 0; i < data; i++) {
			System.out.println("Enter Name");
			String n = reader.readLine();
			name.add(n);
		}
		}catch(Exception e) {
    	   e.printStackTrace();
       }
		    
		for (String name1 : name) {
			System.out.println(name1);
		}
	}

}
