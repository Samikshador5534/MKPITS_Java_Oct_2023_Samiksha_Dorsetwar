package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SingleDimensionalArrayUsing_BubbleSortArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int code[] = new int[5];
		BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter 5 No");
		
		
		
		//
		for (int i = 0; i < code.length; i++) {
			  code[i] = Integer.parseInt(reader.readLine());
		}
		
		System.out.println("Before sorting");
		for( int i=0; i< code.length;i++) {
			System.out.println(" Before Sorting  Array of code[i] is ="+code[i]);
		}
		
		for (int i = 0; i <code.length; i++) {
			for (int j = 0; j <code.length; j++) {
			
				if(code[i]<code[j])
				{
					int temp = code[i];
					code[i]= code[j];
					code[j]= temp;
				}
			}
		}
		System.out.println("After sorting Array");
		for (int i = 0; i < code.length; i++) {
			System.out.println(" After Sorting Array of code[i] is " +code[i]);
		}
		
		
		
		
		
	}

}
