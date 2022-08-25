package com.bl.collection.hashmap;
//Write a Java program to create a set view of the mappings contained in a map. Go to the

import java.util.HashMap;
import java.util.Set;

public class HashMap9 {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Mrunal");
		hashMap.put(4, "Sagar");
		hashMap.put(5, "Akshay");
		 Set set = hashMap.entrySet();
		 System.out.println("set "+set);
	}
}

