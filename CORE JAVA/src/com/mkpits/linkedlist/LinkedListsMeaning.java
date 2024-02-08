package com.mkpits.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListsMeaning {

	public static void main(String[] args) {

		//Linked List is a part of the Collection framework present in java.util package.
		//This class is an implementation of the LinkedList data structure which is a linear data 
		//structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part
       // The elements are linked using pointers and addresses. 
		
		
		//It also has a few disadvantages like the nodes cannot be accessed directly instead we need to start from the head 
		//and follow through the link to reach a node we wish to access.
		// LinkedList acts as a dynamic array and we do not have to specify the size 
		//while creating it, the size of the list automatically increases when we dynamically add and remove items
		//there is no need to increase the size. Internally, the LinkedList is implemented using the doubly linked list data structure. 
		
		//LinkedList(): This constructor is used to create an empty linked list. If we wish to create an empty LinkedList with the name ll, then, it can be created as: 


		LinkedList ll = new LinkedList();    
		
		//LinkedList(Collection C): This constructor is used to create an ordered list that contains all the elements of a specified collection,
		//as returned by the collection’s iterator. If we wish to create a LinkedList with the name ll, then, it can be created as: 

		//Declaration of linked list

		List<Integer> l1 = new LinkedList<Integer>();
	}

}
