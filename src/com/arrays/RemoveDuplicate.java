package com.arrays;

import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] num = { 50, 40, 40, 40, 30, 30, 10, 10, 20, 5, 5 };
		int temp = 0;
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < num.length; i++) {
			int min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[min]) {
					min = j;
				}
			}
			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
		}
		for (int n1 : num) {
			if (s.add(n1)) {
				System.out.print(n1 + " ");
			}
		}

	}

}
