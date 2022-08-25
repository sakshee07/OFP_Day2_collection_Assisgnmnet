package com.bl.collection.treeset;

import java.util.TreeSet;

//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree
//2.iterate
public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Sakshee");
		treeSet.add("Aman");
		treeSet.add("Nikita");
		treeSet.add("Riya");
		treeSet.add("Sejal");
		System.out.println(treeSet);
		
		for(String iterate: treeSet) {
			System.out.println(iterate);
		}
	}
}
