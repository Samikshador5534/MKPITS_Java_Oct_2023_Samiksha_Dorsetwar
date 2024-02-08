package com.mkpits.inheritance;

public class ChildDetails extends Details {

	long mobileNo;
	int id;
	
	
	protected long getMobileNo(long mobileNo)
	{
		this.mobileNo=mobileNo;
		System.out.println("mobile no is :-"+mobileNo);
		return mobileNo;
	}
	 
	
	
	protected int getId(int id) 
	{
		this.id=id;
		System.out.println("id is :-"+id);
		return id;
	}
	
	
	
}
