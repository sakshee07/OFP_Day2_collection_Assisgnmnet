package com.bl.collection.treemap;

import java.util.SortedMap;
import java.util.TreeMap;
//Write a Java program to get the portion of a map whose keys range from a given key
//(inclusive), to another key (exclusive). Go to the editor
public class Example21 {
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		SortedMap<Integer, String> treeMap1 = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Yellow");
		treeMap.put(3, "Pink");
		treeMap.put(4, "Yellow");
		treeMap.put(5, "Grey");
		System.out.println(treeMap);
		 treeMap1 =  treeMap.subMap(2, 4);
		  System.out.println("Sub key-values: " + treeMap1);
		
	}
}




