package com.mkpits.collectionvacation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistIteratorMethod {

	public static void main(String[] args) {


		 ArrayList<String> languages = new ArrayList<>();

		    // Add elements in the array list
		    languages.add("Java");
		    languages.add("Python");
		    languages.add("JavaScript");
		    languages.add("Swift");

		    Iterator<String> iterate = languages.iterator();
		    
		    while (iterate.hasNext()) {
				String string = (String) iterate.next();
				System.out.println(string);
			}
				
			}

	}


