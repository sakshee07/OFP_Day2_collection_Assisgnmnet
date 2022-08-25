package com.bl.arrayList;


import java.util.ArrayList;

//Write a Java program to iterate through all elements in an array list. Go to the editor
public class Iterate {
	public static void main(String[] args) {

		ArrayList<String>arrayList = new ArrayList<>();
		arrayList.add("red");
		arrayList.add("green");
		arrayList.add("yellow");
		arrayList.add("blue");
		arrayList.add("pink");
		System.out.println(arrayList);
		
		for(String elements:arrayList ) {
			System.out.println(elements);
		}
	}

}
