package com.mkpits.collections;

import java.util.ArrayList;
import java.util.List;

public class CharacterArrayList {

	public static void main(String[] args) {


		List<Character> characterList = new ArrayList<Character>();
		characterList.add('s');
		characterList.add('a');
		characterList.add('m');
		characterList.add('i');
		characterList.add('k');
		characterList.add('s');
		characterList.add('h');
		characterList.add('a');
		
		for (Character character1 : characterList) {
			System.out.println(character1);
		}

	}

}
