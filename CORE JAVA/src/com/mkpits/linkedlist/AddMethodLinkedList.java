package com.mkpits.linkedlist;

import java.util.LinkedList;

public class AddMethodLinkedList {

	public static void main(String[] args) {

        LinkedList<String> name = new LinkedList<String>();
		
		name.add("vaibahv");
		name.add("samiksha");
		name.add("raj");
		name.add("harsh");
		name.add("vinay");
		
		System.out.println("list is :- "+name);
		
		//1] add() method in linked list
		name.add("aashik");
		System.out.println("updated list is : "+name);
		
		//2] add(int index, E element)
		//Inserts the specified element at the specified position in this list.
		name.add(2, "pranav");
		System.out.println("add new element in 2nd position :" +name);
		
		
		//3] addFirst(E e)
		//Inserts the specified element at the beginning of this list.
		name.addFirst("karan");
		System.out.println(name);
		
		
		//4] addLast(E e)
		//Appends the specified element to the end of this list.
		name.addLast("chetan");
		System.out.println(name);
		
		 LinkedList<String> name1 = new LinkedList<String>();
			
			name1.add("sonu");
			name1.add("monu");
			name1.add("lambu");
			
			System.out.println("new list is :"+name1);
			
		//5] addAll(int index, Collection<? extends E> c)
		//Inserts all of the elements in the specified collection into this list, starting at the specified position.
			name.addAll(name1);
			System.out.print(name);
			
			
			name.add(3, "monu");
			System.out.println(name);
		
		

	}

}
