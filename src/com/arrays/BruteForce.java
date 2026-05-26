package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class BruteForce {

	public static void main(String[] args) {
		int[] num = { 50, 40, 40, 40, 20, 20, 30, 5, 10, 10 };
		Set<Integer> s = new HashSet<>();
		System.out.println("brute force");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.print(num[j] + " ");
				}

			}
		}
		System.out.println();
		System.out.println("set");
		for (int n : num) {
			if (!s.add(n)) {
				System.out.print(n + " ");
			}
		}

	}

}
