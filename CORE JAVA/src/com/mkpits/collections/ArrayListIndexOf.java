package com.mkpits.collections;

import java.util.ArrayList;

public class ArrayListIndexOf {

	public static void main(String[] args) {

		// create a list of integers
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		// add some integers to the list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(30);
		list.add(60);
		

		// use indexOf() to find the first occurrence of an
		// element in the list
		
		int index = list.indexOf(10);
		int index1 = list.indexOf(40);
		
		System.out.println("index of 1 is "+index); // 0
		System.out.println("index of 4 is "+index1); //3
		
		
		// use lastIndexOf() to find the last occurrence of
		// an element in the list
		
		int lastIndex = list.lastIndexOf(30);
		System.out.println("Index of 3 "+lastIndex);

		System.out.println(list.indexOf(60));  //5
	}

}
