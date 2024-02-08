package com.mkpits.lambdaexpression;

public class FunctionInterfaceCalling {

	 public static void main(String args[])
	    {
	       
	        // functional interface. This interface
	        // by default implements abstractFun()
		 
		 
	        FunctionInterface fobj = (int x)->System.out.println(x*x);
	 
	        // This calls above lambda expression and prints 10.
	        
	        
	        fobj.abstractFun(8);
}
}