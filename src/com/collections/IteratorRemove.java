package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemove {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(35);
		numbers.add(40);

		Iterator<Integer> itr = numbers.iterator();

		while (itr.hasNext()) {

			int num = itr.next();

			if (num > 25) {
				itr.remove();
			}
		}

		System.out.println(numbers);
	}
}