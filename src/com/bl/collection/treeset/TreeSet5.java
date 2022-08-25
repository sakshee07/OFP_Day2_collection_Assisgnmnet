package com.bl.collection.treeset;

import java.util.TreeSet;

//5.get first and last elemet
//6.clone
//7.to get no of elemets in tree
public class TreeSet5 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Sakshee");
		treeSet.add("Aman");
		treeSet.add("Nikita");
		treeSet.add("Riya");
		treeSet.add("Sejal");
		System.out.println(treeSet);
		System.out.println("first -" + treeSet.first());
		System.out.println(treeSet);
		System.out.println("last -" + treeSet.last());
		
		TreeSet<String> newSet = (TreeSet<String>)treeSet.clone();
        System.out.println("Cloned: " + newSet);      
        
        System.out.println(treeSet.size());
   }
}
