package com.mkpits.collections;

import java.util.ArrayList;


public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> colorList1 = new ArrayList<String>();
		
		if(colorList1.isEmpty()) {
			
		}
		colorList1.add("Red");
		colorList1.add("Blue");
		colorList1.add("White");
		colorList1.add("Pink");
		colorList1.add("yellow");

	   ArrayList<String> colorList2 = new ArrayList<String>();
	    colorList2.add("Red");
		colorList2.add("Black");
		colorList2.add("indigo");
		colorList2.add("Pink");
		colorList2.add("green");
		
		System.out.println("Lets Print Color List \n");
		for (String color : colorList1) {
			System.out.println(color);
		}
		
		
		System.out.println("                 ");
		System.out.println("Lets Print Color List 2");
		for (String color2 : colorList2) {
			System.out.println(color2);
		}
		
		
		
		System.out.println("\n colorList1 after addAll");
		colorList1.addAll(colorList2);
		for (String allString : colorList1) {
			System.out.println(allString);
		}
//		
//		
//		System.out.println("\n colorList after remove all");
//		colorList1.removeAll(colorList2);
//		for (String string1 : colorList1) {
//			System.out.println( string1);
//		}
//		
//		
//		
//		
//		System.out.println(" \n colorLisi after equals                  ");
//		colorList2.equals(colorList1);
//		for (String string : colorList2) {
//			System.out.println( string);
//		}
//		
		
		System.out.println("\n colorlist after retain");
		colorList2.retainAll(colorList1);
		for (String string : colorList2) {
			System.out.println(string);
		}
		
		
		
	}

}
