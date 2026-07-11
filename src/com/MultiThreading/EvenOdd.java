package com.MultiThreading;

class EvenThread extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				System.out.println("Even Thread : " + i);
			}
		}
	}
}

class OddThread extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {

			if (i % 2 != 0) {
				System.out.println("Odd Thread : " + i);
			}
		}
	}
}

public class EvenOdd {

	public static void main(String[] args) {

		EvenThread e = new EvenThread();
		OddThread o = new OddThread();

		e.start();
		o.start();
	}
}
