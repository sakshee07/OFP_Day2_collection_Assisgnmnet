package com.bl.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet4 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Sakshee");
		treeSet.add("Aman");
		treeSet.add("Nikita");
		treeSet.add("Riya");
		treeSet.add("Sejal");
		System.out.println(treeSet);
		Iterator iterator = treeSet.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
