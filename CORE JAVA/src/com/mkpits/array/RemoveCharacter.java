package com.mkpits.array;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveCharacter character = new RemoveCharacter();
		character.RemoveCharacter();
		
		
	}
	
	public void RemoveCharacter(){
		
		String name = "Samiksha paidlewar";
		
		char ch[] = new char[name.length()];
		
		for (int i = 0; i < ch.length; i++)
		{
			
			for (int j = i+1; j < ch.length; j++) 
			{
				
				if (name.charAt(i) == name.charAt(j)) 
				{
					
				}
			}
		}
	}

	
	

}
