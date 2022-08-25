package com.bl.collection.hashset;

import java.util.HashSet;
//Write a Java program to compare two sets and retain elements which are same on both sets.


public class HashMap11 {
	public static void main(String[] args) {
		
		 HashSet<String> hashSet = new HashSet<>();
	          hashSet.add("Saki");
	          hashSet.add("Aman");
	          hashSet.add("Akshay");
	          hashSet.add("Sima");
	          System.out.println(" HashSet : "+hashSet);

	          HashSet<String>hashSet1 = new HashSet<>();
	          hashSet1.add("Saki");
	          hashSet1.add("Sagar");
	          hashSet1.add("Akshay");
	          hashSet1.add("Tina");
	          System.out.println(" HashSet 1: "+hashSet1);
	          hashSet.retainAll(hashSet);
	          System.out.println(hashSet.retainAll(hashSet1));
	          System.out.println(hashSet);
	          hashSet.clear();
	          System.out.println(hashSet);
	     }
	}