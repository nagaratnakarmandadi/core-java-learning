package com.Constructors;

public class Employe {
	int empid;
	String name;

	Employe() {
		System.out.println("no arg constructor called");
		System.out.println("wellcome to java");
	}

	Employe(int empid, String name) {
		this();
		System.out.println("parameterised constructor called");
		this.empid = empid;
		this.name = name;

	}

	public static void main(String[] arg) {
		System.out.println("main method started");
		Employe e = new Employe(18, "virat");
		e.display();
		Employe e1 = new Employe(7, "msd");
		e1.display();
		Employe e2 = new Employe(45, "rohit");
		e2.display();
		Employe e3 = new Employe(45, "rohit");
		e3.display();
		

	}

	void display() {
		System.out.println("empid :" + empid);
		System.out.println("ename  :" + name);
	}
}
