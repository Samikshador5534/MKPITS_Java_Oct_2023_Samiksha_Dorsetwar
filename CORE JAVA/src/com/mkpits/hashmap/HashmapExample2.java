package com.mkpits.hashmap;

import java.util.HashMap;

public class HashmapExample2 {

	/*  HashMap(int initialCapacity, float loadFactor)
       It creates a HashMap instance with a specified initial capacity and specified load factor.

       Syntax:

       HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity, float loadFactor);
       */

	 public static void main(String args[])
	    {
	        // No need to mention the generic type twice
	        HashMap<Integer, String> hm1= new HashMap<>(2,0.67f);
	 
	        // Initialization of a HashMap using Generics
	        HashMap<Integer, String> hm2 = new HashMap<Integer, String>(3, 0.5f);
	 
	        // Add Elements using put() method
	        // Custom input elements
	        hm1.put(1, "one");
	        hm1.put(2, "two");
	        hm1.put(3, "three");
	 
	        hm2.put(4, "fourty");
	        hm2.put(5, "eleven");
	        hm2.put(6, "sixty");
	 
	        // Print and display elements in object of hashMap 1
	        System.out.println("Mappings of HashMap hm1 are : "
	                           + hm1);
	 
	        // Print and display elements in object of hashMap 2
	        System.out.println("Mapping of HashMap hm2 are : "
	                           + hm2);
	        
	        hm1.putAll(hm2);
	        System.out.println(hm1);
	        
	        hm1.values().forEach(s-> System.out.println(s));
	        
	        hm1.keySet().forEach(s-> System.out.println(s));
	        
	        
	    }
	}
	