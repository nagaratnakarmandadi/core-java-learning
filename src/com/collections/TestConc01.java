package com.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestConc01 {

	public static void main(String[] args) {
		Map<String, String> map = new ConcurrentHashMap<>();
		map.put("ap", "andhra pradesh");
		map.put("tg", "telangana");
		map.put("tn", "tamil nadu");
		map.put("kn", "karnataka");
		map.put("kl", "kerala");
		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
			map.put("In", "India");
		}
		System.out.println(map);

	}

}
