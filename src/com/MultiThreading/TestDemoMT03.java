package com.MultiThreading;

class AudioThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("audio :" + i);
		}
	}
}

class VideoThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("video :" + i);
		}
	}
}

class TimerThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Timer :" + i);
		}
	}
}

public class TestDemoMT03 {

	public static void main(String[] args) {
		System.out.println("main method started");
		AudioThread at = new AudioThread();
		VideoThread vt = new VideoThread();
		TimerThread tt = new TimerThread();
		at.start();
		vt.start();
		tt.start();
		System.out.println("main method ended");

	}

}
