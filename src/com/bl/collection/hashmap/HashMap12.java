package com.bl.collection.hashmap;

import java.util.HashMap;

//12. Write a Java program to get a collection view of the values contained in this map. Go to the
public class HashMap12 {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Mrunal");
		hashMap.put(4, "Sagar");
		hashMap.put(5, "Akshay");
		System.out.println("Values: " + hashMap.values());
	}
}
