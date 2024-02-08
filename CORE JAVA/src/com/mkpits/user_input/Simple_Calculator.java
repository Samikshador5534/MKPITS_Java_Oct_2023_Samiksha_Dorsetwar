package com.mkpits.user_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mkpits.controlflowstatement.Switches_Cfs;

public class Simple_Calculator {
	
	static BufferedReader reader;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Simple_Calculator sc = new Simple_Calculator();
	    reader = new BufferedReader(new InputStreamReader(System.in));
	    char ch = 'y';
	    
		while (ch == 'y' || ch == 'Y') {
	    System.out.println("************SIMPLE CALCULATOR*************");
		System.out.println(" 1] Addition");
		System.out.println(" 2] Subtraction");
		System.out.println(" 3] Multiplication");
		System.out.println(" 4] Division");
		System.out.println(" 5] Modulus");
			
		int operator = Integer.parseInt(reader.readLine());
		
		 switch (operator) {
		case 1:
			sc.getAddition();
			break;
			
		case 2:
			sc.getSubstraction();
			break;
			
		case 3:
			sc.getMultiplication();
			break;
			
		case 4:
			sc.getDivision();
			break;
			
		case 5:
			sc.getModulus();
			break;
			
		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println(" DO YOU WISH TO CONTINUE Y/N ");
		ch = (char) reader.read();
		reader.readLine();
			
		}
	}
	private double getModulus() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("enter a num1");
		double num1 = Double.parseDouble(reader.readLine());
		
		System.out.println("enter a num2");
	    double num2 = Double.parseDouble(reader.readLine());
		
		double result = num1 % num2;
		System.out.print("output is :- ");
		System.out.println(num1 + "%" +num2 + "=" +result);
		return result;
	}
	
	private double getDivision() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("enter a num1");
		double num1 = Double.parseDouble(reader.readLine());
		
		System.out.println("enter a num2");
	    double num2 = Double.parseDouble(reader.readLine());
		
		double result = num1 / num2;
		System.out.print("output is :- ");
		System.out.println(num1 + "/" +num2 + "=" +result);
		return result;
	}



	private double getMultiplication() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("enter a num1");
		double num1 = Double.parseDouble(reader.readLine());
		
		System.out.println("enter a num2");
	    double num2 = Double.parseDouble(reader.readLine());
		
		double result = num1 * num2;
		System.out.print("output is :- ");
		System.out.println(num1 + "*" +num2 + "=" +result);
		return result;
	}



	private double getSubstraction() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("enter a num1");
		double num1 = Double.parseDouble(reader.readLine());
		
		System.out.println("enter a num2");
	    double num2 = Double.parseDouble(reader.readLine());
		
		double result = num1 - num2;
		System.out.print("output is :- ");
		System.out.println(num1 + "-" +num2 + "=" +result);
		return result;
	}



	public  double getAddition() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("enter a num1");
		double num1 = Double.parseDouble(reader.readLine());
		
		System.out.println("enter a num2");
	    double num2 = Double.parseDouble(reader.readLine());
		
		double result = num1 + num2;
		System.out.print("output is :- ");
		System.out.println( num1 + "+" +num2 + "=" +result);
		return result;
		
		
		
		
	}
			
            
           

	}

		
		
	


