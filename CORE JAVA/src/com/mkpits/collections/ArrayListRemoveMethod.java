package com.mkpits.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveMethod {

	public static void main(String[] args) {

		//creating list class object
		List<String> list = new ArrayList<String>();
		
		list.add("Samiksha");
		list.add("Dorsetwar");
		
		//adding for at 1st indexes
		list.add(1, "Aatish");
		
		// Print the initialArrayList
		System.out.println("Initial ArrayList " + list);

		// Now remove element from the above list
		// present at 1st index
		
		list.remove(1);
		System.out.println("After the Index Removal " + list);

		// Now remove the current object from the updated
		// List
		list.remove("Dorsetwar");
		
		System.out.println("After the Object Removal " + list);
		System.out.println(list.size());
	}

}
