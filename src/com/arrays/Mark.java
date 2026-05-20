package com.arrays;

public class Mark {

	public class StudentMarks {

		public static void main(String[] args) {

			int[][] marks = { { 80, 75, 90 }, { 65, 70, 60 }, { 95, 88, 92 } };

			System.out.println("Student Marks:");

			for (int i = 0; i < marks.length; i++) {

				System.out.println("Student " + (i + 1));

				for (int j = 0; j < marks[i].length; j++) {

					System.out.print(marks[i][j] + " ");
				}

				System.out.println();
			}
		}
	}
}
