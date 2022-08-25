package com.bl.collection.treemap;

import java.util.TreeMap;

//3. Write a Java program to search a key in a TreeMap. Go to the editor
//4. Write a Java program to search a value in a TreeMap. Go to the editor
//5. Write a Java program to get all keys from the given TreeMap. Go to the editor

public class Example3 {
	public static void main(String[] args) {

		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Green");
		treeMap.put(3, "Pink");
		treeMap.put(4, "Yellow");
		treeMap.put(5, "Grey");
		System.out.println("treemap " + treeMap);
		if (treeMap.containsKey(1)) {
			System.out.println("tree is having key 1");
		} else {
			System.out.println("tree is not having this key 1");
		}

		if (treeMap.containsKey(11)) {
			System.out.println("tree is having key11 ");
		} else {
			System.out.println("tree is not having this key11");
		}
	}
}
