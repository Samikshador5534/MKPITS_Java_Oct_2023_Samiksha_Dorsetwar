package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestElement {

    public static void main(String[] args) throws NumberFormatException, IOException {
        int code[] = new int[5];

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        

		System.out.println("Enter 5 No");

        for (int i = 0; i < code.length; i++) {
            code[i] = Integer.parseInt(BR.readLine());
        }

        for (int i = 0; i < code.length; i++) {
            for (int j = i + 1; j < code.length; j++) {
                if (code[j] < code[i]) {
                    int temp = code[i];
                    code[i] = code[j];
                    code[j] = temp;
                }
            }
        }

        int largest = code[code.length-1];
        System.out.println("The largest element is: " + largest);
    //    System.out.println("The second largest element is: " + code[code.length - 2]);
        System.out.println("The third largest element is: " + code[code.length - 3]);
        System.out.println("The second smallest element is: " + code[1]);
        System.out.println("The  smallest element is: " + code[0]);
        
        int secondlargest = 0 ;
        
        for (int k = 0; k < code.length; k++)
        {
			if (largest > code[k]) 
			{
				secondlargest = code[k];
			}

		}
		 System.out.println("The second largest element is: " +secondlargest);
		 

      System.out.println("After sorting Array");
        for (int i = 0; i < code.length; i++) {
            System.out.println("After Sorting Array of code[" + i + "] is " + code[i]);
        }
    }
}
