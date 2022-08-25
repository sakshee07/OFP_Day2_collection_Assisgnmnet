package com.bl.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet9 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSetNum = new TreeSet<Integer>();
		TreeSet<Integer> treeSEt = new TreeSet<Integer>();

		treeSetNum.add(1);
		treeSetNum.add(2);
		treeSetNum.add(3);
		treeSetNum.add(5);
		treeSetNum.add(6);
		treeSetNum.add(7);
		treeSetNum.add(8);
		treeSetNum.add(9);

		treeSEt = (TreeSet) treeSetNum.headSet(7);

		Iterator iterator;
		iterator = treeSEt.iterator();
		System.out.println("Tree set data: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		System.out.println("for 6 : " + treeSetNum.ceiling(6));
		System.out.println("for 0 : " + treeSetNum.ceiling(0));
		
		System.out.println("for 6 : " + treeSetNum.floor(6));
		System.out.println("for 0 : " + treeSetNum.floor(0));
		System.out.println("for 1 : " + treeSetNum.floor(1));

		
		System.out.println("higher :" + treeSetNum.higher(1));
		System.out.println("lower : " + treeSetNum.lower(4));
	}
}
