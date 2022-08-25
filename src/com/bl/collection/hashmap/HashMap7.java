package com.bl.collection.hashmap;

import java.util.HashMap;
//Write a Java program to test if a map contains a mapping for the specified key.


public class HashMap7 {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Mrunal");
		hashMap.put(4, "Sagar");
		hashMap.put(5, "Akshay");
		// print the map
		//System.out.println(" map: " + hashMap);
		if(hashMap.containsKey("Aman")) {
			System.out.println("conatins key" +hashMap.get("Sakshee"));
		}else {
			System.out.println("key is not exixting");
		}
	}
}

