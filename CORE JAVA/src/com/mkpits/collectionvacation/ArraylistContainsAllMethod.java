package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class ArraylistContainsAllMethod {

	public static void main(String[] args) {


		 ArrayList<String> languages1 = new ArrayList<>();
		 
		 languages1.add("JavaScript");
	        languages1.add("Python");
	        languages1.add("Java");
	        System.out.println("ArrayList 1: " + languages1);
	        
	        ArrayList<String> languages2 = new ArrayList<>();

	        languages2.add("Java");
	        languages2.add("Python");
	        System.out.println("ArrayList 2: " + languages2);

	        System.out.println(languages1.containsAll(languages2));
	        
	        System.out.println(languages2.containsAll(languages1));

	}

}
