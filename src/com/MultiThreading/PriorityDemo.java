package com.MultiThreading;

class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(getName() + " Priority : " + getPriority() + " Value : " + i);

		}
	}

}

public class PriorityDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("Maximum Thread");
		MyThread t2 = new MyThread("Minimum Thread");

		t1.setPriority(Thread.MAX_PRIORITY);

		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();

		t2.start();

	}

}
