package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Remove {

	public static void main(String[] args) {
		Collection<String> s = new ArrayList<>();
		s.add("raju");
		s.add("veeru");
		s.add("chandu");
		s.add("hitman");
		s.add("king");
		System.out.println(s);
		s.remove("raju");
		System.out.println(s);
		Collection<String> s1 = new ArrayList<>();
		s1.add("king");
		s1.add("prasad");
		s1.add("main");
		s1.add("tillu");
		s1.add("manoj");
		s.addAll(s1);
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);

	}

}
