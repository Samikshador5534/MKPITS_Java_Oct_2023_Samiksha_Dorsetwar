package com.mkpits.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsingString {

	public static void main(String[] args) {


		 List<String> names = Arrays.asList(
		            "Reflection", "Collection", "Stream","Samiksha");
		 
		        // demonstration of filter method
		        List<String> result
		          = names.stream()
		            .filter(s -> s.startsWith("S"))
		            .collect(Collectors.toList());
		       
		        System.out.println(result);

	}

}
