package com.mkpits.collectionvacation;

import java.util.LinkedList;

public class LinkedlistGetMethod {

	public static void main(String[] args) {


		LinkedList<String> languages = new LinkedList<>();
		
		languages.add("Python");
	    languages.add("Java");
	    languages.add("JavaScript");
	    System.out.println("LinkedList: " + languages);
	    
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);

	}

}
