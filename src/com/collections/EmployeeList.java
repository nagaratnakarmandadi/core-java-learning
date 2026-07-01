package com.collections;

import java.util.ArrayList;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList<String> employees = new ArrayList<>();

		employees.add("Virat");
		employees.add("Rohit");
		employees.add("Gill");
		employees.add("Dhoni");
		employees.add("Rahul");

		System.out.println(employees);

		employees.remove("Gill");

		System.out.println("After Remove:");
		System.out.println(employees);

		System.out.println("Contains Gill : " + employees.contains("Gill"));

		employees.clear();

		System.out.println("After Clear : " + employees);

		System.out.println("Is Empty : " + employees.isEmpty());
	}
}
