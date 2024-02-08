package com.mkpits.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {


		LinkedList<String> name = new LinkedList<String>();
		
		name.add("vaibahv");
		name.add("samiksha");
		name.add("raj");
		name.add("harsh");
		name.add("vinay");
		
		
		Iterator<String> str = name.iterator();
		while (str.hasNext()) {
			String name1 = (String) str.next();
			System.out.println(name1);
		}
		
	}

}
