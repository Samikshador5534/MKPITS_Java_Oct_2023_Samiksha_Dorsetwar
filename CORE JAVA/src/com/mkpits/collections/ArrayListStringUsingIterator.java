package com.mkpits.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStringUsingIterator {

	public static void main(String[] args) {


		List<String> colorList = new ArrayList<String>();
		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("White");
		colorList.add("Pink");
		colorList.add("yellow");
		
		Iterator<String> str = colorList.iterator();
		while (str.hasNext()) {
			String stringList = (String) str.next();
			System.out.println(stringList);
		}
 
	}

}
