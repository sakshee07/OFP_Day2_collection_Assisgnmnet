// Write a Java program to associate the specified value with the specified key in a HashMap.
//Go to the editor
//2.2. Write a Java program to count the number of key-value (size) mappings in a map. Go to the
//editor
package com.bl.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Mrunal");
		hashMap.put(4, "Sagar");
		hashMap.put(5, "Akshay");
		for (Map.Entry a : hashMap.entrySet()) {
			System.out.println(a.getKey() + ", " + a.getValue());
		}
		
		System.out.println("size of hashmap");
		System.out.println(hashMap.size());
	}
}
