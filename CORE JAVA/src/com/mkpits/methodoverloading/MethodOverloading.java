package com.mkpits.methodoverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading overloading = new MethodOverloading();
		overloading.getData();
		overloading.getId(4);
		String firstName = "samiksha";
		overloading.getData("first name is :- "+firstName);
		System.out.println(overloading.getData1("dorsetwar"));
		overloading.getData('F',457657365765l);
		String value = overloading.getData(1,10000);
		System.out.println(value);
		
	}
	public void getData() 
	{
		System.out.println("method called");
	}
	
	
	
	public void getData(String firstName)
	{
		
		System.out.println(firstName);
	}
	
	
	
	 private String getData1(String lastName) {
		String name2 = "dorsetwar";
		return name2;
	
	}
	 
	 
     private void getId(int id) {
			System.out.println("id is :-"+id);
		}
     
     
	 
	public void getData(char c,long mobileNo) 
	{
		char gender = c;
		long no = mobileNo;
		System.out.println("gender is  :-" +gender) ;
		System.out.println("mobileNo is :-"+mobileNo);	
	}
	public String getData(int id, double salary) {  
		// TODO Auto-generated method stub
		double incentive = salary + (salary*0.1);
		String details = "Id is :-"+id +"  salary with incentive is :-"+incentive;
		return details;
	}

	
	
	
    
  

}
