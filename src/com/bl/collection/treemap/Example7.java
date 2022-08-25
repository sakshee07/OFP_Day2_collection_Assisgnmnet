package com.bl.collection.treemap;

import java.util.Comparator;
import java.util.TreeMap;

//7. Write a Java program to sort keys in TreeMap by using a comparator. Go to the editor

public class Example7 {
	public static void main(String[] args) {
		  TreeMap<String,String> treeMap = new TreeMap<String,String>(new sortKey());
		  treeMap.put("1","Red");
		  treeMap.put("2","Yellow");
		  treeMap.put("3","Orange");
		  treeMap.put("4","Pink");
		  treeMap.put("5","White");
		  System.out.println(treeMap);
	}
}

class sortKey implements Comparator<String>{

	@Override
		public int compare(String a, String b) {
			return a.compareTo(b);
		}
		
	}
	

