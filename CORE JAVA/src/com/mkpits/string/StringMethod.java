package com.mkpits.string;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringMethod method = new StringMethod();
		method.getString();
	}

	private void getString() {
		// TODO Auto-generated method stub
		
		String firstName = "Samiksha";
		String lastName = "samikshapaidlewar";
		
		
		//1] string.join
		//Returns a new String composed of copies of the Char-
		//Sequence elements joined together with a copy of the specified delimiter.
		
		// if an element is null, then "null" is added
		
		System.out.println(String.join("@", firstName,lastName));
		
	   //2] charAt[]
		// Returns the char value at the specified index
		// An index ranges from 0 to length() - 1
	
       System.out.println(firstName.charAt(5)); 
       
       //3] codePointAt[]
       //Returns the character (Unicode code point) at the specified index
       //The index refers to char values (Unicode code units) and ranges from 0 to length() - 1
       //If the char value specified at the given index is in the high-surrogate range, the following index is less than the length of this String
        
        System.out.println(firstName.codePointAt(5)); 
        
        //4] equalsIgnoreCase
        //Compares this String to another String, ignoring case considerations.
        //Two strings are considered equal ignoring case if they are of the same length
        //and corresponding Unicode code points in the two strings are equal ignoring case
        //two Unicode code points are considered the same ignoring case if at least one of the following is true:
        //The two Unicode code points are the same (as compared by the == operator)
        //Calling Character.toLowerCase(Character.toUpperCase(int)) on each Unicode code point produces the same result
        
        System.out.println(firstName.equalsIgnoreCase(lastName));
        
        
        //5]contentEquals
        //
        
        System.out.println(firstName.contentEquals(lastName));
        
        System.out.println(firstName.compareToIgnoreCase(lastName));
        
        System.out.println(firstName.contains(lastName));
      
        
        byte[] no = {67,68,69,70,72,75};
        
        char[] ch = {'a','d','e','s'};
        
        String n = new String(no);
        System.out.println(n);
        
        String n1 = new String(no);
        System.out.println(n.charAt(3));
        
        String n4 = new String(no);
        System.out.println(firstName.concat(lastName));
        
        String n2 = new String(ch);
        System.out.println(n2.copyValueOf(ch));
        
        System.out.println(n2.copyValueOf(ch, 0, 3));
        
        System.out.println(firstName.endsWith(firstName));
        
        String n3 = new String(no , 1,3);
        System.out.println(n3);
     
        
        
        
	}
}
