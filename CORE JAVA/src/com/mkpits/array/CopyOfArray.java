package com.mkpits.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CopyOfArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		CopyOfArray array = new CopyOfArray();
		array.getdata();
	}

	private void getdata() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter A number ");
		String pincode []= new String [5];
		
		
		for (int i = 0; i < pincode.length; i++) {
			pincode[i] = reader.readLine();
		}
		
		for (int i = 0; i < pincode.length; i++) {
			System.out.println("pincode is :-"+ pincode[i]);
		}
		
		System.out.println("**************************************************");
		
		String []city = {"nagpur","kamptee","pune","mumbai","solapur"};
		
		String [] copyTo = new String[5];
		System.arraycopy(city, 1, copyTo, 1, 4);
		
		for (String c : copyTo)
		{
			System.out.println(c );
		}
		
		
		
		System.out.println("**************************************************");
		
		//copy range
		
		String newcity[]= Arrays.copyOfRange(city, 0, 3);
		
		for (String b: newcity)
		{
			System.out.println(b);
		}
		
		System.out.println("**************************************************");
		
		
		String newcity1[] = Arrays.copyOf(city, 5);
		
		for (String ans : newcity1)
		{
			System.out.println(ans);
		}
		
		
		

		
		
		
		
	}

	
	
}
