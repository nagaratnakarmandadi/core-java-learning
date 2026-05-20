package com.arrays;

public class Merge {

	public static void main(String[] args) {
		int[] a = { 123 };
		int alen = a.length;
		int[] b = { 4567 };
		int blen = b.length;
		int[] c = new int[alen + blen];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[alen + i] = b[i];
		}
		System.out.println("mergedelements");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + "");
		}

	}

}
