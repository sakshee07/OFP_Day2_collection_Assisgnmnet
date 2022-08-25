package com.bl.collection.treeset;
//Write a Java program to add all the elements of a specified tree set to another tree set.

import java.util.TreeSet;

public class HashSet3 {
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
	}
}
