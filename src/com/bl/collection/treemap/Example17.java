package com.bl.collection.treemap;
//17. Write a Java program to get the greatest key strictly less than the given key. Return null if
//there is no such key. Go to the editor
import java.util.TreeMap;

public class Example17 {
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Yellow");
		treeMap.put(3, "Pink");
		treeMap.put(4, "Yellow");
		treeMap.put(5, "Grey");
		System.out.println(treeMap);
		System.out.println(" for 1: ");
		System.out.println( treeMap.lowerKey(1));
		System.out.println(" for 3: ");
		System.out.println(treeMap.lowerKey(3));
		System.out.println(" for 5 ");
		System.out.println( treeMap.lowerKey(5));
	}
}





