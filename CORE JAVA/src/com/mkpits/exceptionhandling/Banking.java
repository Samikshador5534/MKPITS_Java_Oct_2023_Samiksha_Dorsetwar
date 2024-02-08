package com.mkpits.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Banking {
  
	static int balance;
	static int amount;
	static int c;
	static BufferedReader reader;
	
	public void deposit() {
		System.out.println("Enter Deposit Amount");
		try {
			Banking.amount = Integer.parseInt(reader.readLine());
			System.out.println("Amount Deposited");
		} catch (IOException e) {
			e.printStackTrace();
		}
		balance +=Banking.amount;
	}
	
	 void withdraw() throws LessBalanceException {
		
		System.out.println("Enter Withdraw Amount");
		try {
		Banking.amount = Integer.parseInt(reader.readLine());
	}catch(Exception e) {
		e.printStackTrace();
	}
		if(balance - Banking.amount < 500) {
			throw new LessBalanceException(balance);
		}else {
			balance -= Banking.amount;
		}
	}
	int getbalance() {
		return  balance;
		
	}
	public static void main(String arg[]) {
		Banking b = new Banking();

		try {

			char ch = 'y';
			while (ch == 'y' || ch == 'Y') {

				reader = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("1.Deposit\n2.Withdrawl\n3.Check Balance\nEnter your choice \nchoice=");
				c = Integer.parseInt(reader.readLine());
				switch (c) {
				case 1:

					b.deposit();
					System.out.println("Your Balance is " + balance);
					break;
				case 2:

					b.withdraw();
					System.out.println("Your Balance is " + balance);
					break;
				case 3:

					System.out.println("Your Account Balance is " + balance);
					break;
				default:
					System.out.println("Invalid choice");
				}
				System.out.println("Do you wish to continue?Y/N");
				ch = (char) reader.read();
				reader.readLine();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

