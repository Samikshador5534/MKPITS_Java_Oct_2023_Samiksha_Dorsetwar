package com.mkpits.hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HashmapExample4 {

	public static void main(String[] args) {


       HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("how much data u want to enter");
		

		try {
			int data = Integer.parseInt(reader.readLine()); 
		    for (int i = 0; i < data; i++) {
			hm.put(Integer.parseInt(reader.readLine());
			
		
				}
		}catch(Exception e) {
    	   e.printStackTrace();

		}
		
	
	}
	}
