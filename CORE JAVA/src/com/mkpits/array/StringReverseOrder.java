package com.mkpits.array;

public class StringReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  name = "Samiksha Aatish";
		
		char ch[] = new char [name.length()];
		
		for (int i = 0; i < ch.length; i++)
		{
			//System.out.println(i);
			ch[i] = name.charAt(i);
		}
		for (char c : ch) 
		{
			System.out.print(c);
			
		}
		System.out.println( "\n Reverse order is");
		for (int i = ch.length -1;i >= 0; i--) 
		{
			System.out.print(ch[i]);
		}
		
		
	}

}
