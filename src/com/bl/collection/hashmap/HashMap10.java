package com.bl.collection.hashmap;

import java.util.HashMap;
import java.util.Set;

//. Write a Java program to get the value of a specified key in a map.
public class HashMap10 {
	public static void main(String args[]) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Sakshee");
		hashMap.put(2, "Aman");
		hashMap.put(3, "Mrunal");
		hashMap.put(4, "Sagar");
		hashMap.put(5, "Akshay");
		String val = (String) hashMap.get(3);
		System.out.println("Value for key 3 : " + val);
	}
}
