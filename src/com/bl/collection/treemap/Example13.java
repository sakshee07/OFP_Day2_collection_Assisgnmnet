package com.bl.collection.treemap;


//3. Write a Java program to get the portion of a map whose keys are strictly less than a given
//key. Go to the editor
import java.util.TreeMap;

public class Example13 {
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Yellow");
		treeMap.put(3, "Pink");
		treeMap.put(4, "Yellow");
		treeMap.put(5, "Grey");
		System.out.println(treeMap);
		System.out.println("check for 1: ");
		System.out.println("Value is: " + treeMap.headMap(1));
		System.out.println("check for 3: ");
		System.out.println("Value is: " + treeMap.headMap(3));
		System.out.println("check for 6  ");
		System.out.println("Value is: " + treeMap.headMap(6));
	}
}


