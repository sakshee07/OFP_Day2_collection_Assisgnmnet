package com.bl.collection.treemap;

import java.util.TreeMap;

//Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
//Go to the editor

public class Example9 {
	public static void main(String[] args) {
		TreeMap <String,String> treeMap = new TreeMap <>();
		  treeMap.put("1","Red");
		  treeMap.put("2","Yellow");
		  treeMap.put("3", "Pink");
		  treeMap.put("4", "Yellow");
		  treeMap.put("5", "Grey");
		  System.out.println("all entries "+treeMap);
		  System.out.println("graetest key :"+treeMap.firstKey());
		  System.out.println("least key :"+treeMap.lastKey());
	}
}
