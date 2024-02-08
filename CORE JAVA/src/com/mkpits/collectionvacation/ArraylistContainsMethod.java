package com.mkpits.collectionvacation;

import java.util.ArrayList;

public class ArraylistContainsMethod {

	public static void main(String[] args) {

		 ArrayList<String> languages = new ArrayList<>();
		    languages.add("Java");
		    languages.add("Python");
		    languages.add("JavaScript");
		    System.out.println("ArrayList: " + languages);
		    
		    System.out.print("Is Java present in the arraylist: ");
		    System.out.println(languages.contains("Java"));

	}

}
