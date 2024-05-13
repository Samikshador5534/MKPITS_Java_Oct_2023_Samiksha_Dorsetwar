package com.mkpits.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {

	public static void main(String[] args) {

		 List<String> names = Arrays.asList(
		            "Reflection", "Collection", "Stream","Samiksha");

		 // demonstration of sorted method
	        List<String> show 
	          = names.stream()
	            .sorted()
	            .collect(Collectors.toList());
	       
	        System.out.println(show);
	}

}
