package com.Constructors;

public class Product {
	int pid;
	String pname;
	double price;

	Product() {
		System.out.println("no arg constructor started");

	}

	Product(int pid, String pname, double price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		System.out.println("parameterized constructor is started");

	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		Product p1 = new Product(123, "oneplus", 45000);
		System.out.println(p1.pid);
		System.out.println(p1.pname);
		System.out.println(p1.price);

		Product p = new Product();
		p.pid = 101;
		p.pname = "iphone";
		p.price = 75000;
		System.out.println(p.pid);
		System.out.println(p.pname);
		System.out.println(p.price);

	}

}
