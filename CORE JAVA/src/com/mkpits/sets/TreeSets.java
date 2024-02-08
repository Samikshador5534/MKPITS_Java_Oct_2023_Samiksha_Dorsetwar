package com.mkpits.sets;

import java.util.ArrayList;



public class TreeSets {

	String data;
	ArrayList<TreeSets> children;
	
	public TreeSets(String data) {
		this.data= data;
		this.children = new ArrayList<TreeSets>();
		
	}
	
	public void addChild(TreeSets node) {
		this.children.add(node);
		
	}
	
	public String print(int level) {
		String ret;
		ret = "  ".repeat(level) + data + "\n";
		for (TreeSets node : children) {
			ret += node.print(level + 1);
		}
		return ret;

		

	}

}
