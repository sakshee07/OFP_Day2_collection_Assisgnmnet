package com.bl.collection.treemap;

import java.util.TreeMap;

//6. Write a Java program to delete all elements from a given Tree Map. Go to the editor
public class Example6 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>(); 
		treeMap.put(1,"Red");
		treeMap.put(2,"Green");
		treeMap.put(3,"Pink");
		treeMap.put(4,"Yellow");
		treeMap.put(5,"Grey");
		System.out.println("treemap " +treeMap);
		treeMap.clear();
		System.out.println("after clear "+ treeMap );
	}

}
