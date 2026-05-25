package com.arrays;

public class ForEach {

	public static void main(String[] args) {
		String[][] names = new String[2][2];
		names[0][0] = "ratnakar";
		names[1][1] = "java";
		for (String[] n : names) {
			for (String s : n) {
				System.out.print(s + " ");
			}
			System.out.println();
		}

	}

}
