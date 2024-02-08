package com.mkpits.controlflowstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While_Cfs {

	String name,mobileNo,age ,email;
	int accountNo , withdraw;
	double  balance, Deposit;
	static BufferedReader BR;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		While_Cfs WC = new While_Cfs();
		
		BR = new BufferedReader(new InputStreamReader(System.in));
        char ch = 'y';
		
		while (ch == 'y' || ch == 'Y') {
		System.out.println("WELCOME TO KRIPA BANK");
		System.out.println("*****************************");
		System.out.println("Enter Your Choice \n1.Create Account\n2.Deposit"
					+ "\n3.Withdraw\n4.Check Balance\n5.Account Details");
			int choice = Integer.parseInt(BR.readLine());
			
		switch (choice) {
		case 1:
			WC.createaccount();
			break;
		case 2:
			WC.deposit();
			break;
		case 3:
			WC.withdraw();
			break;
		case 4:
			WC.balance();
			break;
		case 5:
			WC.AccountDetails();
			break;

		default:
			System.out.println("INVALID ACCOUNT");
			break;
		}	
		System.out.println("Do you wish to continue Y/N");
		ch = (char) BR.read();
		BR.readLine();
		}
	}
	private void AccountDetails() {
		// TODO Auto-generated method stub
		System.out.println("Account Holder Name :-"+name);
		System.out.println("Account Number :-"+accountNo);
		System.out.println("Account Holder Email :-"+email);
		System.out.println("Account Holder Mobile :-"+mobileNo);
		System.out.println("Account Holder Age :-"+age);
		System.out.println("Deposit is :-"+Deposit);
		System.out.println("Withdraw is :-"+withdraw);
		System.out.println("Balance is :-"+balance);
		
	}
	private void balance() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		double balance = Deposit - withdraw;
		this.balance=balance;
		System.out.println("Your Balance is :-"+this.balance);
		
		
	}
	
	
	private void withdraw() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("enter a withdraw amount");
		int withdraw = Integer.parseInt(BR.readLine());
		this.withdraw=withdraw;
		
		
	}
	private void deposit() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("deposit Amount is :-");
		double deposit = Double.parseDouble(BR.readLine());
		this.Deposit=deposit;
	}
	private void createaccount() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("ENTER A ACCOUNT HOLDER NAME ");
		 name = BR.readLine();
		
		System.out.println("ENTER A ACCOUNT HOLDER MOBILE NO");
		 mobileNo =BR.readLine();
		
		System.out.println("ENTER A ACCOUNT HOLDER AGE ");
		 age =BR.readLine();
		 

		System.out.println("ENTER EMAIL");
		email = BR.readLine();
		 
		
		int accountNo = (int)Math.floor(Math.random()*1000000);
		this.accountNo = accountNo;
		System.out.println("Account Created "+this.accountNo);
         
		
		
	}

}
