package com.bl.collection.treemap;


//Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.



import java.util.TreeMap;

public class Example11 {
	   public static void main(String args[]) {
		   TreeMap <Integer,String> treeMap = new TreeMap <>();
			  treeMap.put(1,"Red");
			  treeMap.put(2,"Yellow");
			  treeMap.put(3, "Pink");
			  treeMap.put(4, "Yellow");
			  treeMap.put(5, "Grey");
		   System.out.println( treeMap);
		   System.out.println("check for 1: ");
		   System.out.println("Value is: " + treeMap.floorEntry(1));
		   System.out.println("check for 3: ");
		   System.out.println("Value is: " + treeMap.floorEntry(3));
		   System.out.println("check for 6  ");
		   System.out.println("Value is: " + treeMap.floorEntry(6));
		  }
}
