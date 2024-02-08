package com.mkpits.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListAllMethod {

	public static void main(String[] args) {
		
		List<String> color = new ArrayList<String>();
		
		color.add("Red");
		color.add("Blue");
		color.add("White");
		color.add("Pink");
		color.add("yellow");
		
		ArrayList<String> colorList2 = new ArrayList<String>();
		colorList2.add("Red");
	    colorList2.add("Blue");
		
		//get method
		//public E get(int index)
		//Returns the element at the specified position in this list.
		
		System.out.println(color.get(2));
		System.out.println(color);
		
		
		//contains
		//public boolean contains(Object o)
		//Returns true if this list contains the specified element. More formally
		//returns true if and only if this list contains at least one element e such that Objects.equals(o, e).
		
		System.out.println(color.contains("yellow"));
		
		System.out.println(color.get(2).equals("White"));
	
		//hashCode()
		//Returns the hash code value for this list.
		System.out.println(color.hashCode());
		
		
		//isEmpty()
		//Returns true if this list contains no elements.
		System.out.println(colorList2.isEmpty());
		
		
		//iterator
		//declare list itrator
		ListIterator listitr = color.listIterator();
		
		//forward Itration
		System.out.println("Forward Traversal");
		while (listitr.hasNext()) {
			Object value = (Object) listitr.next();
			System.out.println(value);
		}
		
		
		
		//backword Iteration
		System.out.println("Backword Iteration");
		while (listitr.hasPrevious()) {
			Object value1 = (Object) listitr.previous();
			System.out.println(value1);
		}
		
		//RetainAll() Method
		//Retains only the elements in this list that are contained in the specified collection.
		System.out.println("retain all");
		System.out.println("color Contains :" +color);
		System.out.println("colorlist Contains :" + colorList2);
		color.retainAll(colorList2);
		System.out.println("colorlist Contains :" + color);
		
		
		color.toArray();
		
		
	}
}
