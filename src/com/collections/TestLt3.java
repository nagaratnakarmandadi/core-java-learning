package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestLt3 {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("karthik");
		l1.add("prasad");
		l1.add("teja");
		l1.add("ram");
		l1.add("balaji");
		l1.add(1, "virat");
		System.out.println(l1.contains("karthik"));
		System.out.println(l1);
		List<String> l2 = new ArrayList<>();
		l2.add("lohit");
		l2.add("akash");
		l2.add("chandu");
		l2.add("mohit");
		l2.add("rupesh");
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		System.out.println(l1.containsAll(l2));
		l1.addAll(2, l2);
		System.out.println(l1);
		l1.clear();
		System.out.println(l1);
		System.out.println(l1.contains("karthik"));
		System.out.println(l1.containsAll(l2));

	}

}
