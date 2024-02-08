package com.mkpits.Interface;

public class Interface_CallingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		cow cow = new cow();
		cow.animalsound();
		cow.sleep();
		
		Donkey myDonkey = new Donkey();
		myDonkey.animalsound();
		myDonkey.sleep();
		
		Animal myAnimal = new Goat();
		myAnimal.animalsound();
		myAnimal.sleep();
		
		Rabbit rabbit = new Rabbit();
		rabbit.animalsound();
		rabbit.sleep();
	}

}
