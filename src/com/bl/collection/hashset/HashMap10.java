package com.bl.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashMap10 {
	public static void main(String[] args) {
	
		 HashSet<String> hashSet = new HashSet<String>();
	          hashSet.add("Saki");
	          hashSet.add("Aman");
	          hashSet.add("Akshay");
	          hashSet.add("Sima");

	          HashSet<String>hashSet1 = new HashSet<String>();
	          hashSet1.add("Saki");
	          hashSet1.add("Sagar");
	          hashSet1.add("Akshay");
	          hashSet1.add("Tina");
	          HashSet<String>result = new HashSet<>();
	         for (String element : hashSet){
	             System.out.println(hashSet1.contains(element) ? "Yes" : "No");
	          }      
	     }
	}