package com.collections;

import java.util.*;

public class TestQueue {

	public static void main(String args[]) {
		PriorityQueue<String> pq = new PriorityQueue<>();

		pq.add("Geeks");
		pq.add("For");
		pq.add("Geeks");

		System.out.println("Initial PriorityQueue " + pq);

		// using the method
		pq.remove("Geeks");

		System.out.println("After Remove: " + pq);

		System.out.println("Poll Method: " + pq.poll());

		System.out.println("Final PriorityQueue: " + pq);
		System.out.println("@@@@@@@@@@@@@@@@@");

		PriorityQueue<Integer> pq1 = new PriorityQueue<>();

		pq1.add(1);
		pq1.add(10);
		pq1.add(5);

		System.out.println("Initial PriorityQueue " + pq1);

		// using the method
		pq1.remove(5);

		System.out.println("After Remove: " + pq1);

		System.out.println("Poll Method: " + pq1.poll());

		System.out.println("Final PriorityQueue: " + pq1);
	}
}
