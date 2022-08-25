package com.bl.collection.hashmap;

import java.util.HashMap;

public class HashMap8 {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Mrunal");
		hashMap.put(4, "Sagar");
		hashMap.put(5, "Akshay");
		// print the map
		//System.out.println(" map: " + hashMap);
		if(hashMap.containsValue("Aman")) {
			System.out.println("conatins value" +hashMap.get("Sakshee"));
		}else {
			System.out.println("value is not exixting");
		}
	}
}

