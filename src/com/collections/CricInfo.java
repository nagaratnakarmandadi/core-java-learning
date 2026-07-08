package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CricInfo {

	public static void main(String[] args) {
		Map<Integer, String> ci = new HashMap<>();
		ci.put(18, "vk");
		ci.put(7, "msd");
		ci.put(45, "hitman");
		ci.put(8, "jaddu");
		ci.put(1, "kl");
		ci.put(9, "sanju");
		System.out.println(ci);
		Set<Integer> Keys = ci.keySet();
		System.out.println(Keys);
		Collection<String> values = ci.values();
		System.out.println(values);
		System.out.println(ci.put(77, "gill"));
		System.out.println(ci.put(77, "iyer"));
		Set<Entry<Integer, String>> entries = ci.entrySet();
		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}

	}

}
