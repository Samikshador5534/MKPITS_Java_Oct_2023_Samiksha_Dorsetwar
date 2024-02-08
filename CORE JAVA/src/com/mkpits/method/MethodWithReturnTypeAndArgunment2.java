package com.mkpits.method;

public class MethodWithReturnTypeAndArgunment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithReturnTypeAndArgunment2 MWRTAA = new MethodWithReturnTypeAndArgunment2();
		String value = MWRTAA.getUser(1,"samiksha",2484829292l,"samiksha@gmail.com",12000) ;
		System.out.println(value);
		
	}

	private String getUser(int id, String name, long mobileNo, String email, int salary) {
		// TODO Auto-generated method stub
		
		double incentive= salary +(salary *0.1);
		String details = "Id is :-"+id +  " "+ "name is :-" +name +" " + "moblie no is :-" +mobileNo + " "+ "email is :-" +email + " "+" salary with incentive is :-"+incentive;
		return details;
	}

}
