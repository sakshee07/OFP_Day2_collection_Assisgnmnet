package com.bl.collection.treemap;

import java.util.Set;
import java.util.TreeMap;

public class Example5 {
	public static void main(String[] args) {
		
	
	
	TreeMap<Integer, String> treeMap = new TreeMap<>();
	treeMap.put(1, "Red");
	treeMap.put(2, "Green");
	treeMap.put(3, "Pink");
	treeMap.put(4, "Yellow");
	treeMap.put(5, "Grey");
	Set<Integer> keySet = treeMap.keySet();
	System.out.println(keySet);

	}
}
