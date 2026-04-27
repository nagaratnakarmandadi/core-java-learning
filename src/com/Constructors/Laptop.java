package com.Constructors;

 public class Laptop {
	String brand;
	String processor;
	int ram;
	double price;

	Laptop(String brand, String processor) {
		this.brand = brand;
		this.processor = processor;
	}

	Laptop(int ram, double price) {
		this.ram = ram;
		this.price = price;
	}

	Laptop(Laptop l1, Laptop l2) {
		this.brand = l1.brand;
		this.processor = l1.processor;
		this.ram = l2.ram;
		this.price = l2.price;
	}

	void show() {
		System.out.println("Brand: " + brand);
		System.out.println("Processor: " + processor);
		System.out.println("RAM: " + ram);
		System.out.println("Price: " + price);
	}

	public static void main(String[] args) {
		Laptop l1 = new Laptop("Dell", "i7");
		Laptop l2 = new Laptop(16, 80000);

		Laptop l3 = new Laptop(l1, l2);
		l3.show();
	}
}
