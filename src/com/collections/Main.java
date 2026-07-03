package com.collections;

import java.util.ArrayList;

class Queue {
	private ArrayList<Integer> queue;

	// Constructor
	public Queue() {
		queue = new ArrayList<>();
	}

	// 1. Enqueue
	public void enqueue(int element) {
		queue.add(element);
		System.out.println(element + " inserted.");
	}

	// 2. Dequeue
	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return queue.remove(0);
	}

	// 3. Peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return queue.get(0);
	}

	// 4. isEmpty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	// Display Queue
	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty.");
		} else {
			System.out.println("Queue: " + queue);
		}
	}
}

public class Main {
	public static void main(String[] args) {

		Queue q = new Queue();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		q.display();

		System.out.println("Front Element: " + q.peek());

		System.out.println("Removed: " + q.dequeue());

		q.display();

		System.out.println("Is Queue Empty? " + q.isEmpty());
	}
}
