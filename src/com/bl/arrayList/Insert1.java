package com.bl.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Insert1 {
	//Write a Java program to insert an element into the array list at the first position. Go to the
	//editor
	
	
	//Write a Java program to retrieve an element (at a specified index) from a given array list. Go
	//to the editor
	
	//Write a Java program to update a specific array element by a given element. Go to the editor
	
	//6. Write a Java program to remove the third element from an array list. Go to the editor
	
	//7. Write a Java program to search for an element in an array list. Go to the editor
	
	//Write a Java program to sort a given array list. Go to the editor
	public static void main(String[] args) {

		ArrayList<String>arrayList = new ArrayList<>();
		arrayList.add("red");
		arrayList.add("green");
		arrayList.add("yellow");
		arrayList.add("blue");
		arrayList.add("pink");
		
		arrayList.add(0, "Mixed Colors");
		System.out.println(arrayList);
		
		String retrivedElement = arrayList.get(2);
		System.out.println(retrivedElement);
		
		arrayList.set(1, "grey");
		System.out.println(arrayList);
		
		arrayList.remove(2);
		System.out.println(arrayList);
		
		
		System.out.println(arrayList.contains("pink"));
		
	
		}
	}
