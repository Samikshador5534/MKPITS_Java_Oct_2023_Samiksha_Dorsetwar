package com.mkpits.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListString {

	public static void main(String[] args) {
 
		List<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("White");
		colorList.add("Pink");
		colorList.add("yellow");
		colorList.add("violet");
		colorList.add("indigo");
		colorList.add("purple");
		colorList.add("silver");
		colorList.add("gold");
		colorList.add("blue");
		colorList.add("greem");
		
		
		for (String string1 : colorList) {
			System.out.println("the color is : "+string1);
		}
		
		

	}

}
