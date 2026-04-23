package com.Methods;

public class Methods {
	void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Methods t1 = new Methods();
		t1.show();
		m1();

	}

	static void m1() {
		m2();
		System.out.println("m1");
	}

	static void m2() {
		m3();
		System.out.println("m2");
	}

	static void m3() {
		System.out.println("m3");
	}

}
