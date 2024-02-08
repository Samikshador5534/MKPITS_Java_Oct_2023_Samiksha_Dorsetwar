package com.mkpits.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseOrderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Integer no[] = {10,20,30,40,50,60};
		 
		 Arrays.sort(no,Collections.reverseOrder());
		 
		 for (Integer n : no) 
		 {
			System.out.println(n);
		 }
		 
		 
		 
		 System.out.println("***********************************************");
		 for (int i = 0; i < no.length; i++)
		 {
			System.out.print(no[i] + " ");
		 }
		 
		 

			
				
			}
	}


