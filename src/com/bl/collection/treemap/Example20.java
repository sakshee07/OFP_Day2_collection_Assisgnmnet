package com.bl.collection.treemap;

import java.util.TreeMap;

public class Example20 {
	public static void main(String args[]) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Yellow");
		treeMap.put(3, "Pink");
		treeMap.put(4, "Yellow");
		treeMap.put(5, "Grey");
		System.out.println(treeMap);
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap);
	}
}





