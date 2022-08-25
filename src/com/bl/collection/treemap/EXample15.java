package com.bl.collection.treemap;

import java.util.TreeMap;

//Write a Java program to get the least key strictly greater than the given key. Return null if
//there is no such key. Go to the editor
public class EXample15 {
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Yellow");
		treeMap.put(3, "Pink");
		treeMap.put(4, "Yellow");
		treeMap.put(5, "Grey");
		System.out.println(treeMap);
		System.out.println(" for 1: ");
		System.out.println( treeMap.higherEntry(1));
		System.out.println(" for 3: ");
		System.out.println(treeMap.higherEntry(3));
		System.out.println(" for 6  ");
		System.out.println( treeMap.higherEntry(6));
	}
}




