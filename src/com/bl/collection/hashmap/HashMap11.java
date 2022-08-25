package com.bl.collection.hashmap;

import java.util.HashMap;
import java.util.Set;

//11. Write a Java program to get a set view of the keys contained in this map. Go to the editor
public class HashMap11 {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Mrunal");
		hashMap.put(4, "Sagar");
		hashMap.put(5, "Akshay");
		Set keyset = hashMap.keySet();

		System.out.println("Key set values are: " + keyset);
	}
}
