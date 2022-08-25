package com.bl.collection.hashset;

import java.util.HashSet;

public class HashMap9 {
	public static void main(String[] args) {
		
	
	HashSet<String> hashSet = new HashSet<String>();
	hashSet.add("Sakshee");
	hashSet.add("Aman");
	hashSet.add("Neha");
	hashSet.add("Suraj");
	hashSet.add("Priyanka");
	hashSet.add("Aakash");
	System.out.println(hashSet);
	String[] array = new String[hashSet.size()];
	hashSet.toArray(array);

	System.out.println("Array elements: ");
	for (String element : array) {
		System.out.println(element);
		}
	}
}

