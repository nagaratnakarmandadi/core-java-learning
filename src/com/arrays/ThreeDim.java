package com.arrays;

public class ThreeDim {

	public static void main(String[] args) {
		String[][][] StrArr = { { { "naga ", "ratnakar", "mandadi" }, { "j2se", "j2ee" }, { "html", "css" }, } };
		System.out.println(StrArr);

		for (int i = 0; i < StrArr.length; i++) {
			for (int j = 0; j < StrArr[i].length; j++) {
				for (int k = 0; k < StrArr[i][j].length; k++) {
					System.out.print(StrArr[i][j][k] + " ");

				}
				System.out.println();
			}
			System.out.println();

		}

		int[][][] arr = new int[3][3][3];
		arr[0][0][0] = 003;
		arr[1][1][1] = 111;
		arr[2][2][2] = 222;
		for (int[][] arr2 : arr) {
			for (int[] arr1 : arr2) {
				for (int num : arr1) {
					System.out.print(num + " ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
		}

	}

}
