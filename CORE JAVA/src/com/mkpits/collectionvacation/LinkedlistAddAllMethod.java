package com.mkpits.collectionvacation;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistAddAllMethod {

	public static void main(String[] args) {

		  LinkedList<String> list = new LinkedList<String>();
		  
		  
		    list.addLast("Goat");
	        list.addLast("4");
	        list.addLast("Great");
	        list.addLast("7");
	        
	        ArrayList<String> languages = new ArrayList<>();

	        languages.add("Java");
	        languages.add("JavaScript");
	        languages.add("Python");
	        System.out.println("Programming Languages: " + languages);

	        list.addAll(languages);
	        System.out.println(list);

	}

}
