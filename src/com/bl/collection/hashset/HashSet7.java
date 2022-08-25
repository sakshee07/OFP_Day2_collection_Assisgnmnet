package com.bl.collection.hashset;

import java.util.HashSet;

//7. Write a Java program to convert a hash set to an array. Go to the editor
public class HashSet7 {
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
