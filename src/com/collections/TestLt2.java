package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestLt2 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(90);
		System.out.println(l);
		l.remove(5);

		System.out.println(l);
		List<String> l1 = new ArrayList<>();
		l1.add("virat");
		l1.add("rohit");
		l1.add("axer");
		l1.add("msd");
		l1.add("shami");
		l1.add("sundhar");
		System.out.println(l1);
		l1.remove("msd");
		try {
			l1.remove(l1.indexOf("shami"));
		} catch (Exception e) {
			System.err.println("indexOutOfBounds");
			e.printStackTrace();
		}
		System.out.println(l1);

	}

}
