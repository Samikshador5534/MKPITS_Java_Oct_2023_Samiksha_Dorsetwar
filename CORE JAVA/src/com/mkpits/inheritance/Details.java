package com.mkpits.inheritance;

public class Details {

	String fName,lName = "Dorsetwar";

	protected String getfName(String fName)
	{
		
		this.fName=fName;
		System.out.println("First Name is :-"+fName);
		return fName;
		
	}

	protected void getlName(String lName)
	{
		this.lName=lName;
		System.out.println("last Name is :-"+lName);
	
	}

	


}
