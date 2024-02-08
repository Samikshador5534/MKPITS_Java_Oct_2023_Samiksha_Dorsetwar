package com.mkpits.hashmap;

import java.util.HashMap;

public class HahmapReplaceMethod {

	public static void main(String[] args) {


		/*The replace(K key, V value) method of Map interface, implemented by HashMap class
		 * HashMap class is used to replace the value of the specified key only if the key is previously mapped with some values
		 * Syntax:

           public V replace(K key, V value)
           
         Parameters: This method accepts two parameters:
          key: which is the key of the element whose value has to be replaced.
          value: which is the new value which has to be mapped with the provided key.
		 */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 123);
		map.put("b", 234);
		map.put("c", 456);
		map.put("d", 456);
		map.put("e", 980);
		
		
		
		System.out.println(map);
		
		map.replace("c",4566);
		
		System.out.println("new hashmap "+ map.toString());

	}

}
