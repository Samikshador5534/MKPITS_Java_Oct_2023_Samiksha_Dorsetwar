package com.mkpits.method;

public class AllMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AllMethodType AMT = new AllMethodType();
		AMT.getFirstName();
		
		AMT.getmobileNo(456577567l);
		
		
		System.out.println(AMT.getLastName());
		
		String uValue = AMT.getDetails(1,10000);
		System.out.println(uValue);
	}
	
	

}
