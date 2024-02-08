package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HahmapExample3 {

	public static void main(String[] args) {

        Map<Integer, String> list = new HashMap<Integer, String>();
		
		list.put(1, "samiksha");
		list.put(2, "vaibhav");
		list.put(3, "raj");
		list.put(3, "dadu");
		
		for (Entry<Integer, String>  value: list.entrySet()) 
		{
			System.out.println("keys :" +value.getKey() + "   values : "+value.getValue());
		}
		
		
		

	}

}
