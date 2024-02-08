package com.mkpits.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListInteger {

	public static void main(String[] args) {


            List<Integer> marksList = new ArrayList<Integer>();
            marksList.add(23);
            marksList.add(45);
            marksList.add(67);
            marksList.add(89);
            marksList.add(90);
            
            
            //using for loop array
            for (int i = 0; i < marksList.size(); i++) 
            {
				System.out.println(marksList.get(i));
			}
            
            
            //using for each loop
            for (Integer integer1 : marksList) {
				System.out.println("the integer value is :"+integer1);
			}
            
            
            //using iterator
            System.out.println("........using iterator.....");
            Iterator<Integer> itr = marksList.iterator();
            while (itr.hasNext()) 
            {
				Integer integer2 = (Integer) itr.next();
				System.out.println(integer2);
				
			}
            

	}

}
