package com.bl.collection.hashset;
//8. Write a Java program to convert a hash set to a tree set. Go to the editor

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashMap8 {
	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Sakshee");
		hashSet.add("Aman");
		hashSet.add("Neha");
		hashSet.add("Suraj");
		hashSet.add("Priyanka");
		hashSet.add("Aakash");
		System.out.println(hashSet);

		Set<String> treeSet = new TreeSet<>(hashSet);
		System.out.println("TreeSet elements: ");
		for (String element : treeSet) {
			System.out.println(element);
		}

		List<String> list = new ArrayList<>(hashSet);
		System.out.println("ArrayList : " + list);
	}
}
