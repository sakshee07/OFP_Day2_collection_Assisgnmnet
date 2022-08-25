package com.bl.collection.treemap;

import java.util.TreeMap;


//
//1. Write a Java program to associate the specified value with the specified key in a TreeMap.
//Go to the editor
//2. Write a Java program to copy a Tree Map content to another Tree Map. Go to the editor

public class Example1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>(); 
		treeMap.put(1,"Red");
		treeMap.put(2,"Green");
		treeMap.put(3,"Pink");
		treeMap.put(4,"Yellow");
		treeMap.put(5,"Grey");
		System.out.println("treemap " +treeMap);
		
		TreeMap<Integer, String> treeMap2 = new TreeMap<>(); 
		treeMap2.put(16,"Violet");
		treeMap2.put(17,"Black");
		System.out.println(treeMap2);
		treeMap.putAll(treeMap2);
		System.out.println( "treemap "+ treeMap);


		

	}
}
