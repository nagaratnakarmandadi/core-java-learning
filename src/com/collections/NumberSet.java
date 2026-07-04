package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class NumberSet {

	public static void main(String[] args) {

		HashSet<Integer> numbers = new HashSet<>();

		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);

		numbers.remove(30);

		Iterator<Integer> itr = numbers.iterator();

		System.out.println("Numbers");

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Is Empty : " + numbers.isEmpty());

	}
}
