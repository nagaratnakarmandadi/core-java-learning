package com.Constructors;

public class Employee {
	int eid;
	String ename;

	Employee() {
		System.out.println("no arg constructor");
		System.out.println("wellcome to java world");

	}

	Employee(int eid, String ename) {
		this();
		System.out.println("paramaterized constructor");
		this.eid = eid;
		this.ename = ename;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Employee e = new Employee(18, "virat");
		e.display();
		Employee e1 = new Employee(45, "hitman");
		e1.display();
		Employee e2 = new Employee(7, "thala");
		e2.display();

	}

	void display() {
		System.out.println("employee name" + ename);
		System.out.println("eid" + eid);
	}

}
