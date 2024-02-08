package com.mkpits.string;

public class String_Buffer {

	// string buffer
	//A thread-safe, mutable sequence of characters
	//A string buffer is like a String, but can be modified
	//At any point in time it contains some particular sequence of characters, but the length and content of the sequence can be changed through certain method calls
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String_Buffer buffer = new String_Buffer();
		buffer.getStringConstructor();
		
	}

	private void getStringConstructor() {
		// TODO Auto-generated method stub
		
		
		String myStr = "You are a very beautiful ";
		StringBuffer oPut = new StringBuffer(myStr);
		System.out.println(oPut);
		
		
		String newStr = "  Nice to meet you";
		
		
		// 1]Append
		//Appends the string representation of the boolean argument to the sequence
		
		oPut = oPut.append(" /t" + newStr,   3 ,15);  ///t = it gives 6 pixel spaces
		System.out.println(oPut);
		
		
		//2] charAt
		//Returns the char value in this sequence at the specified index.
		//The first char value is at index 0, the next at index 1, and so on
		
		System.out.println(myStr.charAt(5));
		
		
		//3]Append(long)
		//Appends the string representation of the long argument to this sequence.
		
	//	System.out.println(oPut.append( "/t" +34456454l));
		
		
		//4]codePointBefore();
		// Returns the character (Unicode code point) before the specified index.
		
		System.out.println(myStr.codePointBefore(5));
		
		
		//5]codePointCount(int beginIndex, int endIndex)
		//Returns the number of Unicode code points in the specified text range of this sequence.
		
		
		
		System.out.println(newStr.codePointCount(2, 8));
		
		//6]capacity()
		// Returns the current capacity
		
	//	System.out.println(oPut.capacity());
		
		//7]compareTo(StringBuffer another)
		//Compares two StringBuffer instances lexicographically.
		
		System.out.println(myStr.compareTo(myStr));
		
		//8]contains()
		
		System.out.println(newStr.contains(myStr));
		
		
		//9] equals()
		System.out.println(newStr.equals(newStr));
		
	
		//10]length()
		
		
		System.out.println(myStr.length());
		
		//11]isEmpty()
		
		String c = " fgf";
		//boolean cFT = c.isEmpty();
		System.out.println(c.isEmpty());
		
		//12]indexOf(String str, int fromIndex)
		
		System.out.println(oPut.indexOf(newStr ,5));
		
		
		System.out.println(oPut.lastIndexOf(myStr, 5));
		
		System.out.println(newStr.toString());
		
		
		//13]insert(int offset, boolean b)
		//System.out.println(oPut.insert(5, false));
	
		
		//14]substring(int start, int end)
		//The substring() method of Java StringBuilder class is used to returns a new String from this character sequence
		
		System.out.println(oPut.substring(0, 5));
		
		
		//15] delete(in start , in end)
		// delete the character from start index to end index in the given values
		
		
		System.out.println(oPut.delete(1, 6));
		
		
		//16]Insert(int offset,float value)
		// add a float value in the given string index
		
		System.out.println(oPut.insert(4, 22.3));
		
		
		//17]
		
		
	}

}
