package com.bl.collection.treemap;

import java.util.TreeMap;
// Write a Java program to get the portion of this map whose keys are less than (or equal to, if
//inclusive is true) a given key. Go to the editor
public class Example14 {
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Yellow");
		treeMap.put(3, "Pink");
		treeMap.put(4, "Yellow");
		treeMap.put(5, "Grey");
		System.out.println(treeMap);
		System.out.println(" for 1: ");
		System.out.println( treeMap.headMap(1,true));
		System.out.println(" for 3: ");
		System.out.println(treeMap.headMap(3,true));
		System.out.println(" for 6  ");
		System.out.println( treeMap.headMap(6,true));
	}
}


