package com.arrays;

public class TwoDimentional {

	public static void main(ForEach[] args) {
		int[][] num = new int[2][3];
		num[0][0] = 101;
		num[0][1] = 102;
		num[0][2] = 103;
		num[1][0] = 104;
		num[1][1] = 105;
		num[1][2] = 106;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
