package com.collections;

import java.util.ArrayList;

public class EmployeeList1 {

	public static void main(String[] args) {

		ArrayList<String> employees = new ArrayList<>();

		employees.add("Raj");
		employees.add("Virat");
		employees.add("Rahul");
		employees.add("Gill");

		System.out.println("Before Remove");
		System.out.println(employees);

		employees.remove("Rahul");

		employees.set(1, "Rohit");

		System.out.println("After Update");
		System.out.println(employees);

		System.out.println("Is Empty : " + employees.isEmpty());

	}
}
