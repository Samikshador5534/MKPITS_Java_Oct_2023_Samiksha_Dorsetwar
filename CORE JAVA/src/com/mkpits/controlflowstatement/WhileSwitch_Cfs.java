package com.mkpits.controlflowstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileSwitch_Cfs {

	 static BufferedReader BR;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		 
		

			WhileSwitch_Cfs cfs =new WhileSwitch_Cfs();
			
			
		    BR = new BufferedReader(new InputStreamReader(System.in));
		    char ch = 'y';
			
			while (ch == 'y' || ch == 'Y') {
		  //  cfs.table();
		    System.out.println("WELCOME TO THE HUNGER HOUSE CAFE");
		    System.out.println("BOOK THE TABLE");
		    System.out.println("**************************************************************************");
		    System.out.println(" ****** TABLE :- 1  *******");
		    System.out.println("1] Continental Food ");
		    System.out.println(" ***** TABLE :- 2  ******");
		    System.out.println("2] Indian Food ");
		    System.out.println(" ******  TABLE :- 3   *******");
		    System.out.println("3] Chinese Food ");
		    System.out.println("  ******* TABLE :- 4   *******");
		    System.out.println("4] Mexican Food ");
		    System.out.println("  ******* TABLE :- 5   *******");
		    System.out.println("5] Street Food ");
		    System.out.println("Enter Food Choices");
		    int choice = Integer.parseInt(BR.readLine());
		  //  cfs.table1();
		  
		    
		    switch (choice){
			case 1:
				cfs.continentalFood();
				
				
				break;
			case 2:
				cfs.indianFood();
				
			    break;
			case 3:
				cfs.chineseFood();
				
				break;
			case 4:
				cfs.mexicanFood();
				
				break;
			case 5:
				cfs.streetFood();
				
				break;

			default:
				System.out.println("hotel is closed");
				break;
			}
		    System.out.println("Do you wish to continue Y/N");
			ch = (char) BR.read();
			BR.readLine(); 
		}
		
	}
	private void streetFood() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter A Menu Name");
		String Menu = BR.readLine();
		System.out.println("Enter A Token");
		String token = BR.readLine();
		
		if (Menu.equals("Panipuri") || (Menu.equals("PANIPURI")) && (token.equals("sam@123"))) {
			//if (token.equals("sam@123")) {
			System.out.println("Order is Placed");
		}
		else {
			System.out.println("Order is Failed");
		}
			}
		
		
	
	private void mexicanFood() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter A Menu Name");
		String Menu = BR.readLine();
		System.out.println("Enter A Token");
		String token = BR.readLine();
		if (Menu.equals("mexicanrice") || (Menu.equals("MEXICANRICE")) && (token.equals("sam@123"))) {
			
			System.out.println("Order is Placed");
		}
		else {
			System.out.println("Order is Failed");
		}
		}
		
	
	private void chineseFood() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter A Menu Name");
		String Menu = BR.readLine();
		System.out.println("Enter A Token");
		String token = BR.readLine();
		if (Menu.equals("MANCHURIAN") || (Menu.equals("manchurian") )&& (token.equals("sam@123"))) {
			System.out.println("Order is Placed");
		}
		else {
			System.out.println("Order is Failed");
		}}
		private void indianFood() throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Menu card");
		System.out.println("1. SAMOSA \n 2.DAHIVADA \n 3. KACHORI \n 4.VEGTHALI");
		System.out.println("Enter A Token");
		String token = BR.readLine();
		System.out.println("Enter your choice");
		int digit = Integer.parseInt(BR.readLine());
		if(digit >0 && digit <=4) {
			
		switch (digit) {
		case 1:
			
			System.out.println("you ordered samosa");
			System.out.println("THANKS N VISIT AGAIN!");
			break;
			
		case 2: 
			System.out.println("you ordered DAHIVADA");
            break;
            
		case 3: 
			System.out.println("you ordered KACHORI");
            break;
            
		case 4: 
			System.out.println("you ordered VEGTHALI");
            break;    
			
		default:
			System.out.println("ordered closed");
			break;
		}	
		}
		}
	
	private void continentalFood() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter A Menu Name");
		String Menu = BR.readLine();
		System.out.println("Enter A Token");
		String token = BR.readLine();
		if (Menu.equals("Spring Rolls") || (Menu.equals("SPRING ROLLS")) && (token.equals("sam@123")) ) {
			System.out.println("Order is Placed");
		}
		else {
			System.out.println("Order is Failed");
		}
		
	}
	}


