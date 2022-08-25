package com.bl.collection.treeset;

import java.util.TreeSet;

public class TreeSet8 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Sakshee");
		treeSet.add("Aman");
		treeSet.add("Nikita");
		System.out.println("set1: " + treeSet);
		TreeSet<String> treeSet2 = new TreeSet<>();
		treeSet2.add("Riya");
		treeSet2.add("Sejal");
		System.out.println(" set2: " + treeSet2);
		treeSet.addAll(treeSet2);
		System.out.println(" set1: " + treeSet);
		TreeSet<String> newSet = new TreeSet<String>();
		for (String element : treeSet) {
			System.out.println(treeSet2.contains(element) ? "Yes" : "No");
		}
	}
}
