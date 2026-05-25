package com.arrays;

public class EachLoop {

	public static void main(String[] args) {
		int[][] numbers = new int[3][3];
		numbers[0][0] = 1;
		numbers[1][1] = 1;
		numbers[2][2] = 1;
		for (int[] number : numbers) {
			for (int num : number) {
				System.out.print (num + " ");

			}
			System.out.println();
		}

	}

}
