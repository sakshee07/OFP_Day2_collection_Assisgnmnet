package com.bl.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
//Write a Java program to test a hash set is empty or not.


public class hashSet2 {
	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Sakshee");
		hashSet.add("Aman");
		hashSet.add("Neha");
		hashSet.add("Suraj");
		hashSet.add("Priyanka");
		hashSet.add("Aakash");
		System.out.println(hashSet);

		System.out.println(hashSet.isEmpty());
		hashSet.removeAll(hashSet);
		System.out.println(hashSet);
	}
}