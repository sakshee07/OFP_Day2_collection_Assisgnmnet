package com.bl.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to append the specified element to the end of a hash set. Go to the
//2.iterate through all ellements
//3.get noof elements of hashset
//4.empty a hashset
public class HashSet1 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Sakshee");
		hashSet.add("Aman");
		hashSet.add("Neha");
		hashSet.add("Suraj");
		hashSet.add("Priyanka");
		hashSet.add("Aakash");
		System.out.println(hashSet);
		
		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(hashSet.size());
		
		System.out.println("empty hashset");
		hashSet.clear();
		System.out.println(hashSet);

	}
}