package com.bl.collection.hashmap;

import java.util.HashMap;

public class HashMap3 {
//	Write a Java program to copy all of the mappings from the specified map to another map. Go
//	to the editor
//4.clear map
	//5.5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
	
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		HashMap<Integer, String> hashMap2 = new HashMap<>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Sagar");
		System.out.println("first map: " + hashMap);
		hashMap2.put(4, "Akshay");
		hashMap2.put(5, "Mrunal");
		hashMap2.put(6, "Divya");
		System.out.println("second map: " + hashMap2);

		hashMap2.putAll(hashMap);
		System.out.println(" map: " + hashMap2);
		
		hashMap.clear();
		System.out.println(hashMap);
		boolean empty = hashMap.isEmpty();
		System.out.println(empty);
		
		
		
	}
}
