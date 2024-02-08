package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
	
	/*This class is found in java.util package
	 *  It provides the basic implementation of the Map interface of Java
	 *  HashMap in Java stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer)
	 *  Java HashMap is similar to HashTable, but it is unsynchronized. 
	 *  It allows to store the null keys as well, but there should be only one null key object and there can be any number of null values
	 *  
	 */

	public static void main(String[] args) {

		Map<Integer, String> list = new HashMap<Integer, String>();
		
		list.put(1, "samiksha");
		list.put(2, "vaibhav");
		list.put(3, "raj");
		list.put(3, "dadu");
		
		System.out.println(list);
		
		System.out.println(list.get(3));   //get the value of that index
		
		
		System.out.println("size of the map is : "+list.size());
		
		list.put(4, "tinku");      //add the new element in the list
		System.out.println(list);
		
		
		System.out.println(list.containsKey(5));   // check the key is contains above the list or not if not then expected output will be false otherwise true
		
		System.out.println(list.containsValue("tinku")); // check the value is contains or not if value is contains then expected output in boolean form
		
		
		for (Entry<Integer, String> e: list.entrySet()) {
			System.out.println("key :" +e.getKey()+ "    value :" +e.getValue());  // for each loop
		}
		
			

	}

}
