package com.collections;

import java.util.ArrayList;

public class MergeList {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(10);
		list1.add(20);
		list1.add(30);

		list2.add(40);
		list2.add(50);
		list2.add(60);

		System.out.println("List1 : " + list1);
		System.out.println("List2 : " + list2);

		list1.addAll(list2);

		System.out.println("Merged List : " + list1);

		System.out.println("Equals : " + list1.equals(list2));

		System.out.println("HashCode List1 : " + list1.hashCode());
		System.out.println("HashCode List2 : " + list2.hashCode());
	}
}
