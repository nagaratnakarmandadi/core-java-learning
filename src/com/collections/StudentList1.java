package com.collections;

import java.util.ArrayList;

public class StudentList1 {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();

		students.add("Virat");
		students.add("Rohit");
		students.add("Gill");
		students.add("Dhoni");
		students.add("Hardik");

		System.out.println("Total Students : " + students.size());

		System.out.println("Contains Rohit : " + students.contains("Rohit"));

		System.out.println("Student List");

		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
}
