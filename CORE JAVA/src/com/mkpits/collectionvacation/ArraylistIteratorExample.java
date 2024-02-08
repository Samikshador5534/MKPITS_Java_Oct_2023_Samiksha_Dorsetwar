package com.mkpits.collectionvacation;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistIteratorExample {

	public static void main(String[] args) {


		 ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		 
		 
		  list.add("Mango");//Adding object in arraylist    
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		  
		  
		  //Traversing list through Iterator  
		  Iterator<String> itr=list.iterator();//getting the Iterator  
		  
		 for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}

}
}