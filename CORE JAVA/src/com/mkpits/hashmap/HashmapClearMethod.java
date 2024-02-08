package com.mkpits.hashmap;

import java.util.HashMap;

public class HashmapClearMethod {

	public static void main(String[] args) {

		HashMap<Integer, String> hash_list = new HashMap<Integer, String>();
		
		hash_list.put(1, "aaa");
		hash_list.put(2, "sss");
		hash_list.put(3, "hhh");
		hash_list.put(4, "uio");
		hash_list.put(5, "jhh");
		
		hash_list.values().forEach(S-> System.out.println(S));  //lambda expression 
		
		hash_list.clear();
		
		//hash_list.values().forEach(S-> System.out.println(S));
		
		System.out.println(hash_list);

	}

}
