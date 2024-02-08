package com.mkpits.linkedlist;

import java.util.LinkedList;
import java.util.Spliterator;

public class SpliteratorLinkedListMethod {

	public static void main(String[] args) {

		 LinkedList<String> NameOfMovies = new LinkedList<String>();
		 
	        // Add Strings to list
	        // each string represents city name
	        NameOfMovies.add("Delhi 6");
	        NameOfMovies.add("3 Idiots");
	        NameOfMovies.add("Stree");
	        NameOfMovies.add("Airlift");
	        
	        System.out.println(NameOfMovies);
	        
	        
	        Spliterator<String> str = NameOfMovies.spliterator();
	        str.forEachRemaining(n);

	}

}
