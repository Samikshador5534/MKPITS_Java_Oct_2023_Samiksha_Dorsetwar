package com.mkpits.linkedlist;

import java.util.LinkedList;

public class RemoveLinkedListMethod {

	public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<String>();
		
		name.add("vaibahv");
		name.add("samiksha");
		name.add("raj");
		name.add("10");
		name.add("vinay");
		name.add("raj");
		name.add("20");
		name.add("10");
		
		//// Printing the elements inside LinkedList
		System.out.println("linkedlist is : "+name);

		name.remove();
		System.out.println(name);
		
		//* remove(int index)
		//Removes the element at the specified position in this list
		name.remove(2);
		System.out.println(name);
		
		
		//* remove(Object o)
		//Removes the first occurrence of the specified element from this list, if it is present.
		name.remove("raj");
		name.remove("20");
		System.out.println(name);
		
		
		//* LinkedList.remove(Object O)
		// It is used to remove any particular element from the linked list.
		name.removeLast();
		System.out.println(name);
		
		
		//* removeFirst()
		//Removes and returns the first element from this list.
		name.removeFirst();
		System.out.println(name);
		
		
		//* rremoveFirstOccurrence(Object o)
		//Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
		name.removeLastOccurrence("raj");
		System.out.println(name);
		
		
		//
		

	}

}
