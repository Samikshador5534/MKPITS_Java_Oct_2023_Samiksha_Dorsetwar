package com.mkpits.oprators;

public class Assignment_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Assignment_Operator opr = new Assignment_Operator();
		opr.addEqualTo();
		opr.subEqualTo();
		opr.mulEqualTo();
		opr.divEqualTo();
		opr.modEqualTo();
		System.out.println(opr.getAdd());
		
	}
	
	public int getAdd() {
		int name1 = 30;
		int name2 = 30;
		int total = name1+=name2;
		return total;
	}

	private void modEqualTo() {
		int a =60;
		System.out.println("the value of a is :-"  +a );
		int b = 20;
		System.out.println("the value of b is :-"  +b);
		int c = a %=b;
		System.out.println("the output is :-" +c);
		System.out.println("   ");
		
	}

	private void divEqualTo() {
		int a =20;
		System.out.println("the value of a is :-"+a );
		int b = 20;
		System.out.println("the value of b is :-"+b);
		int c = a /=b;
		System.out.println("the output is :-" +c);
		System.out.println("   ");
		
	}

	private void mulEqualTo() {
		int a =10;
		System.out.println("the value of a is :-"+a );
		int b = 20;
		System.out.println("the value of b is :-"+b);
		int c = a *=b;
		System.out.println("the output is :-" +c);
		System.out.println("   ");
		
	}

	private void addEqualTo() {
	
		int a =10;
		System.out.println("the value of a is :-"+a );
		int b = 20;
		System.out.println("the value of b is :-"+b);
		int c = a +=b;
		System.out.println("the output is :-" +c);
		System.out.println("   ");
		
	}
	
	private void subEqualTo() {
		
		int a =10;
		System.out.println("the value of a is :-"+a );
		int b = 20;
		System.out.println("the value of b is :-"+b);
		int c = a -=b;
		System.out.println("the output is :-" +c);
		System.out.println("   ");
		
	}
	
	

	

}
