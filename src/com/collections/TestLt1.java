package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestLt1 {
	public static void main(String[] args) throws Exception {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		System.out.println(l.size());
		l.add(2, 99);
		l.add(5, 88);
		try {
			l.add(6, 77);
		} catch (Exception e) {
			System.err.println("indexoutofboundexception");

		}
		System.out.println(l);
	}

}
