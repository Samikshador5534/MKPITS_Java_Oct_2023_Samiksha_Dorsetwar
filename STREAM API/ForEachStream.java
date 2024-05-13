package com.mkpits.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachStream {

	public static void main(String[] args) {

		//without Stream
		
		List<Integer> number = Arrays.asList(2, 3, 4, 5 ,50); 
		
//		List<Integer> listEven = new ArrayList<>();
//		
//		for (Integer i : number) {
//			if(i % 2 == 0) {
//				listEven.add(i);
//			}
//		}
//        System.out.println(listEven);
//	}

	//using stream
	
	 List<Boolean> even 
     = number.stream()
       .map(x -> x % 2 == 0)
       .collect(Collectors.toList());
	System.out.println(even);
	
}
}