package com.bl.collection.treemap;

import java.util.TreeMap;
//. Write a Java program to remove and get a key-value mapping associated with the least key
//in a map. Go to the editor
public class Example19 {
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Yellow");
		treeMap.put(3, "Pink");
		treeMap.put(4, "Yellow");
		treeMap.put(5, "Grey");
		System.out.println(treeMap);
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap);
		
	}
}




