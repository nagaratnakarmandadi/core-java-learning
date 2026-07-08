package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class EachCharacter {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String:");
		String name = sc.nextLine();

		char[] ch = name.toCharArray();

		// Count frequency of each character
		for (char c : ch) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		// Print each character and its frequency
		Set<Entry<Character, Integer>> entries = map.entrySet();

		for (Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		sc.close();
	}
}