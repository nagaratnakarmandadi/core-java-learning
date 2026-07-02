package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		Collection<String> s = new ArrayList<>();
		s.add("karthik");
		s.add("pranathi");
		s.add("shushu");
		s.add("prasad");
		s.add("teja");
		System.out.println(s);
		Collection<String> t = new ArrayList<>();
		t.add("raju");
		t.add("veeru");
		t.add("chandu");
		t.add("hitman");
		t.add("king");
		System.out.println(t);
		t.addAll(s);
		System.out.println(t);
		t.clear();
		System.out.println(t);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		if (s.contains(name)) {
			System.out.println("name is found ");
		} else {
			System.out.println("name is not found ");

		}
		s.hashCode();
		t.hashCode();
		if (s.equals(s)) {
			System.out.println("is equal");
		} else {
			System.out.println("not equal");
		}

		sc.close();

	}

}
