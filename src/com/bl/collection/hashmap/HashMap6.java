package com.bl.collection.hashmap;

import java.util.HashMap;

//6. Write a Java program to get a shallow copy of a HashMap instance. Go to the editor	
public class HashMap6 {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Mrunal");
		hashMap.put(4, "Sagar");
		hashMap.put(5, "Akshay");
		// print the map
		System.out.println("privious map: " + hashMap);
		HashMap<Integer, String> newHashMap = new HashMap<>();
		newHashMap = (HashMap) hashMap.clone();
		System.out.println(" cloned map: " + newHashMap);
	}
}