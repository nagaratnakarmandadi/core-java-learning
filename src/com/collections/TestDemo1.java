package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo1 {

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(101);
		c.add(102);
		c.add(103);
		c.add(104);
		c.add(105);
		System.out.println(c);
		Collection<Integer> d = new ArrayList<>();
		d.add(408);
		d.add(409);
		d.add(410);
		d.add(340);
		System.out.println(d);
		d.addAll(c);
		System.out.println(d);

	}

}
