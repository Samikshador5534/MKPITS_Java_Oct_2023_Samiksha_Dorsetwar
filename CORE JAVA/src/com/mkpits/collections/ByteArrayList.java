package com.mkpits.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ByteArrayList {

	public static void main(String[] args) {

		List<Byte> byteList = new ArrayList<Byte>();
		 byteList.add((byte) 1);
		 byteList.add((byte) 2);
		 byteList.add((byte) 3);
		 byteList.add((byte) 4);
		 byteList.add((byte) 5);
		 byteList.add((byte) 6);
		 byteList.add((byte) 7);
		 byteList.add((byte) 8);
		 byteList.add((byte) 9);
		 byteList.add((byte) 10);
		 byteList.add((byte) 11);
		 byteList.add((byte) 12);
		 
		 
		 System.out.println("....using for each.....");
		 for (Byte byte1 : byteList) {
			System.out.println( byte1);
		}
		 
		 System.out.println("....using for loop.....");
		 for (int i = 0; i < byteList.size(); i++) {
			System.out.println(byteList.get(i));
		}
		 
		 System.out.println("....using itertor......");
		 Iterator<Byte> itr = byteList.iterator();
		 while (itr.hasNext()) {
			Byte byte1 = (Byte) itr.next();
			System.out.println(byte1);
		}
	}

}
