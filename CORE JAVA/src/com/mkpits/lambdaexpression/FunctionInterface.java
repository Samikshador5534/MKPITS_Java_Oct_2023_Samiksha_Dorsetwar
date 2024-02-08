package com.mkpits.lambdaexpression;

public interface FunctionInterface {

	//Lambda Expressions implement the only abstract function and therefore implement functional interfaces
	
	//Enable to treat functionality as a method argument, or code as data.
	//A function that can be created without belonging to any class.
	//A lambda expression can be passed around as if it was an object and executed on demand.
	
	 // An abstract function
	
	
    void abstractFun(int x);
 
    // A non-abstract (or default) function
    
    
    default void normalFun()
    {
       System.out.println("Hello");
    }
}
 

