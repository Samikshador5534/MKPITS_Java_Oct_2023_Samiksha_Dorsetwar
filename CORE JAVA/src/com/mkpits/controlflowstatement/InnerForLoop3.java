package com.mkpits.controlflowstatement;


public class InnerForLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A';
			
			for (int i =1; i <= 5 ; i++) {
				for (int j =5 ; j>=i; --j) {
					System.out.print("  *");
				}
		    	System.out.println();
			}
			for (int i =1; i <= 5 ; i++) {
		    for(int k=1;k<=i;k++)
		          { 	
                    System.out.print("  *");            
	              }
		    System.out.println();
}
			System.out.println("--------------------------------------------");
			
			
			
			
			for (int i =1; i <= 5 ; i++) {
			    for(int k=1;k<=i;k++)
			          { 	
					System.out.print(ch++ +" ");
				}
		    	System.out.println();
			}
			for (int i =1; i <= 5 ; i++) {
				for (int j =5 ; j>=i; --j) {
			
                    System.out.print(ch++ + " ");            
	              }
		    System.out.println();
}
			System.out.println("--------------------------------------------");
			
			
			for (int i =1; i <= 5 ; i++) {
			    for(int k=1;k<=i;k++)
			          { 	
					System.out.print(++ch +" ");
				}
		    	System.out.println();
			}
			for (int i =1; i <= 5 ; i++) {
				for (int j =5 ; j>=i; --j) {
			
                    System.out.print(++ch + " ");            
	              }
		    System.out.println();
}
			
            System.out.println("--------------------------------------------");
			
			
			for (int i =1; i <= 5 ; i++) {
			    for(int k=1;k<=i;k++)
			          { 	
					System.out.print("  *");
				}
		    	System.out.println();
			}
			for (int i =1; i <= 5 ; i++) {
				for (int j =5 ; j>=i; --j) {
			
                    System.out.print("  *");            
	              }
		    System.out.println();
}
			

            System.out.println("--------------------------------------------");
			
			
			for (int i =1; i <= 5 ; i++) {
			    for(int k=1;k<=i;k++)
			          { 	
					System.out.print(" "+ k);
				}
		    	System.out.println();
			}
			for (int i =1; i <= 5 ; i++) {
				for (int j =5 ; j>=i; --j) {
			
                    System.out.print(" " +j);            
	              }
		    System.out.println();
}
			
			 System.out.println("--------------------------------------------");
				
				
				for (int i =1; i <= 5 ; i++) {
				    for(int k=1;k<=i;k++)
				          { 	
						System.out.print(" "+ k);
					}
			    	System.out.println();
				}
				
				 System.out.println("--------------------------------------------");
					
				 for (int i =1; i <= 5 ; i++) {
						for (int j =5 ; j>=i; --j) {
					
		                    System.out.print(" " +j);            
			              }
				    System.out.println();
		}
				 System.out.println("--------------------------------------------");
					
				 for (int i =1; i <= 5 ; i++) {
						for (int j =5 ; j>=i; --j) {
					
		                    System.out.print(ch = 'A');            
			              }
				    System.out.println();
		}
					
			
	}
}