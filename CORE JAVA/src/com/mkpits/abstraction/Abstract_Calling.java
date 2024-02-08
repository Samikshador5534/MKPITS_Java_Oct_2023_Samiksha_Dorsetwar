package com.mkpits.abstraction;

public class Abstract_Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monkey mymonkey = new Monkey();
		Dog mydog = new Dog();
		Pig mypig = new Pig();
		
		mymonkey.animalsound();
		mymonkey.sleep();
		mydog.animalsound();
		mypig.animalsound();
		
		
	}

}
