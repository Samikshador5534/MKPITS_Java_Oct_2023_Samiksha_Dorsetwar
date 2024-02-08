package com.mkpits.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapContainsValueMethod {

	public static void main(String[] args) {

		 Map<Integer, String> list = new HashMap<Integer, String>();
			
			list.put(1, "samiksha");
			list.put(2, "vaibhav");
			list.put(4, "raj");
			list.put(3, "dadu");
			
			System.out.println(list.containsValue("raj"));
			
			list.values().forEach(s-> System.out.println(s));

	}

}
