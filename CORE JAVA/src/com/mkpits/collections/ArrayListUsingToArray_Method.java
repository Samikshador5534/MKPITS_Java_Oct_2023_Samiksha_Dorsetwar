package com.mkpits.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListUsingToArray_Method {

	public static void main(String[] args) {
		
	
	List<Integer> list = new ArrayList<Integer>();
	
	 // Add elements
	 list.add(32);
	 list.add(67);
	 list.add(100);
	 list.add(1);

    // print ArrayList
    System.out.println("ArrayList: " +  list );

    // Get the array of the elements
    // of the ArrayList
    // using toArray() method
     list.toArray();

    System.out.println("Elements of ArrayList"  + " as Array: "+ Arrays.toString(list.toArray()));
}

}
