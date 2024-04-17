package com.mkpits.controlflowstatement;

public class CountNoOfDigitInteger {


	  public static void main(String[] args) {

	    int count = 0, num = 000345255;

	    while (num != 0) {
	      // num = num/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	  }
	}
	
