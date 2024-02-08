package com.mkpits.user_input;

public class VowelsNConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "This is very bea1utiful  peaceful   Place";
		
		int vowels = 0 , consonant = 0, digit = 0 , spaces = 0;
		
		word = word.toUpperCase();
		for (int i = 0; i < word.length(); ++i)
		{
			char ch = word.charAt(i);
			
		 if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		 {
			 ++vowels;
			     
		 }	
		 else if (ch >='A' && ch <= 'Z') 
		 {
			 ++consonant;
		 }
		 else if (ch >='0' && ch <='9')
		 {
			 ++digit;
		 }
		 else if (ch == ' ') {
			 ++spaces;
		 }
		
			 
		}
		System.out.println("vowel is :-"+vowels);
		System.out.println("consonant is :-"+consonant);
		System.out.println("digit is :-"+digit);
		System.out.println("spaces is :-"+spaces);
		
		
	}

}
