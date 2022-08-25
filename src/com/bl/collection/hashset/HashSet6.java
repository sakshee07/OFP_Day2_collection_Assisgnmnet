package com.bl.collection.hashset;

import java.util.HashSet;

//6. Write a Java program to clone a hash set to another hash set. Go to the editor
public class HashSet6 {
	public static void main(String[] args) {

			HashSet<String> hashSet = new HashSet<String>();
			hashSet.add("Sakshee");
			hashSet.add("Aman");
			hashSet.add("Neha");
			hashSet.add("Suraj");
			hashSet.add("Priyanka");
			hashSet.add("Aakash");
			System.out.println(hashSet);
		System.out.println(" Hash Set: " + hashSet);
	    HashSet <String> newHashSet = new HashSet <> ();
	    newHashSet = (HashSet)hashSet.clone();
	    System.out.println("Cloned Hash Set: " + hashSet);         
	   }
	}