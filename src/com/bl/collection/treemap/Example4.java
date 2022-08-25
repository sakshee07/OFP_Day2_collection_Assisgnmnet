package com.bl.collection.treemap;

import java.util.TreeMap;

public class Example4 {
	public static void main(String[] args) {


		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("1", "Red");
		treeMap.put("2", "Green");
		treeMap.put("3","Pink");
		treeMap.put("4", "Yellow");
		treeMap.put("5", "Grey");
		System.out.println("treemap " + treeMap);
		if (treeMap.containsKey("Green")) {
			System.out.println("tree is having value ");
		} else {
			System.out.println("tree is not having value");
		}

		if (treeMap.containsKey("Cyan")) {
			System.out.println("tree is having value cyan ");
		} else {
			System.out.println("tree is not having cyan value");
		}
	}
}
