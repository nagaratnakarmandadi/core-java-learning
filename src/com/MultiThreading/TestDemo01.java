package com.MultiThreading;

public class TestDemo01 extends Thread {
	public void run() {
		System.out.println("show method called ");
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 5; i++) {
			System.out.println("show" + i);
		}
		System.out.println("shoe method ended");
	}

	public static void main(String[] args) {
		System.out.println("main method called ");
		System.out.println(Thread.currentThread());
//		System.out.println("statements 1");
//		System.out.println("statements 2");
//		System.out.println("statements 3");
//		System.out.println("statements 4");
//		System.out.println("statements 5");
		TestDemo01 t2 = new TestDemo01();
		t2.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main" + i);
		}
		System.out.println("main method ended");

	}

}
