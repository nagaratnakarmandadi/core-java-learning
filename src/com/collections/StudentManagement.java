package com.collections;

import java.util.ArrayList;

public class StudentManagement {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();

		students.add("Virat");
		students.add("Rohit");
		students.add("Gill");
		students.add("Dhoni");
		students.add("Hardik");

		System.out.println("Student List : " + students);

		System.out.println("Total Students : " + students.size());

		System.out.println("Contains Virat : " + students.contains("Virat"));
	}
}
