package com.Constructors;

public class Emp {
	int age;
	String name;

	public Emp(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method from EMP");
		System.out.println("good morning");

	}

}

class Man extends Emp {
	double salary;

	public Man(double salary, int age, String name) {
		super(age, name);

		this.salary = salary;
	}

	public static void main(String[] arg) {
		System.out.println("main method from man");
		Man m = new Man(320000, 30, "naga");
		m.display();

	}

	void display() {
		System.out.println("age of the emp:" + age);
		System.out.println("nameof the emp :" + name);
		System.out.println("salary of the emp :" + salary);
	}

}
