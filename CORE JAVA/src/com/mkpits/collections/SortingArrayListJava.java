package com.mkpits.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingArrayListJava {

	public static void main(String[] args) {

        List<String> fruitList = new ArrayList<String>();
		
		fruitList.add("Mango");
		fruitList.add("Banana");
		fruitList.add("grapes");
		fruitList.add("orange");
		fruitList.add("dates");
		
		System.out.println(".....before Sorting Array List.......");
		for (String string1 : fruitList) {
			System.out.println(string1);
		}
		
		Collections.sort(fruitList); 
		
		System.out.println(".....After Sorting Array List.......");
		for (String string : fruitList) {
			System.out.println(string);
		}
	}

}
