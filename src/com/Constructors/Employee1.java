package com.Constructors;

public class Employee1 {
	String name;
	String designation;

	public static void main(String[] args) {
		System.out.println("Main method from employe");

	}

	Employee1(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
}

class Manager extends Employee1 {
	double salary;

	public Manager(String name, double salary, String designation) {
		super(name, designation);
		this.salary = salary;
	}

	public static void main(String[] args) {
		System.out.println("main method from manager");
		Manager m = new Manager("chandu", 100000, "manager");
		m.display();

	}

	void display() {
		System.out.println("name of the employee  :" + name);
		System.out.println("salary of the employee  :" + salary);
		System.out.println("designation : " + designation);

	}

}
