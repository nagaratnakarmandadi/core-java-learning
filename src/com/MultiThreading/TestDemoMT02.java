package com.MultiThreading;

public class TestDemoMT02 implements Runnable {
	@Override
	public void run() {
		System.out.println("run method started ");
		for (int i = 0; i <= 20; i++) {
			System.out.println("run:" + i);
		}
		System.out.println("run method ended");

	}

	public static void main(String[] args) {
		System.out.println("main method ");
		TestDemoMT02 t1 = new TestDemoMT02();
		Thread t = new Thread(t1);
		t.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("main :" + i);
		}
		System.out.println("main method ended");

	}

}
