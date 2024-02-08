package com.mkpits.controlflowstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InnerForLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
         BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("enter a number");
		int n = Integer.parseInt(reader.readLine());
		
		for (int i =0; i <= n ; i++) {
			for (int j =1 ; j<=n-i; ++j) {
				System.out.print(j);
			}
			System.out.println();
		for (int j = 1; j <= n-i; ++j) {
				System.out.print("*");
			}
			System.out.println();
	}

}
	}
