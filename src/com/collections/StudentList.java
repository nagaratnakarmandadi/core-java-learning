package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentList {

	public static void main(String[] args) {

		ArrayList<String> students = new ArrayList<>();

		students.add("Virat");
		students.add("Rohit");
		students.add("Dhoni");
		students.add("Gill");
		students.add("Hardik");

		System.out.println("Contains Virat: " + students.contains("Virat"));

		System.out.println("Is List Empty: " + students.isEmpty());

		System.out.println("Student Names:");

		Iterator<String> itr = students.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
