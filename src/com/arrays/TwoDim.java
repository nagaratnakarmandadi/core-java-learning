package com.arrays;

public class TwoDim {

	public static void main(ForEach[] args) {

		int[][] num = new int[3][3];

		num[0][0] = 10;

		num[1][1] = 100;
		num[2][2] = 1000;

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < num[i].length; j++) {

				System.out.print(num[i][j] + " ");
			}

			System.out.println();
		}
	}
}
