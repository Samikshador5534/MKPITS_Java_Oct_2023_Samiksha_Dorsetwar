package com.mkpits.controlflowstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse_Cfs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


			BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Brand name");
			String brandName = BR.readLine();
			
			
			System.out.println("Enter a expiry month of product");
			String expiry = BR.readLine();
			
			if (brandName.equals ("COLORBAR") ){
				if(expiry.equals("2023")){
					System.out.println("product is validate");
				}
				else	
			{
				System.out.println("*******************************************");
				System.out.println("product is  non validate ");
			}
	}

}
}