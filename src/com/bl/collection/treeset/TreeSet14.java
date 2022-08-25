package com.bl.collection.treeset;

import java.util.TreeSet;

public class TreeSet14 {
	public static void main(String[] args) {
		TreeSet<Integer> treeSetNum = new TreeSet<Integer>();
		
		treeSetNum.add(1);
		treeSetNum.add(2);
		treeSetNum.add(3);
		treeSetNum.add(5);
		treeSetNum.add(6);
		treeSetNum.add(7);
		treeSetNum.add(8);
		treeSetNum.add(9);
		
		 System.out.println("remove element: "+treeSetNum.pollFirst());
		 System.out.println(" after removing first element: "+treeSetNum);
		 
		 System.out.println("remove element: "+treeSetNum.pollLast());
		 System.out.println(" after removing last element: "+treeSetNum);
	}

}
