package com.Constructors;

class Employee2 {
	int id;
	String name;
	double salary;

	Employee2(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

class Manager1 extends Employee2 {
	String department;

	Manager1(int id, String name, double salary, String department) {
		super(id, name, salary);
		this.department = department;
	}

	void displayManager() {
		display();
		System.out.println("Department: " + department);
	}

	public static void main(String[] args) {
		System.out.println("Employee Management System Started");

		Manager1 m1 = new Manager1(101, "Naga", 50000, "IT");
		Manager1 m2 = new Manager1(102, "Chandu", 60000, "HR");

		System.out.println("\nManager 1 Details:");
		m1.displayManager();

		System.out.println("\nManager 2 Details:");
		m2.displayManager();
	}
}