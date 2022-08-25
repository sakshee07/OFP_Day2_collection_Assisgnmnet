package com.bl.collection.treemap;

import java.util.TreeMap;

public class Example10 {

	public static void main(String[] args) {

		  TreeMap <String,String> treeMap = new TreeMap <>();
		  treeMap.put("1","Red");
		  treeMap.put("2","Yellow");
		  treeMap.put("3", "Pink");
		  treeMap.put("4", "Yellow");
		  treeMap.put("5", "Grey");
		  System.out.println(" TreeMap "+ treeMap);
		  System.out.println("Reverse " + treeMap.descendingKeySet());
	}

}
