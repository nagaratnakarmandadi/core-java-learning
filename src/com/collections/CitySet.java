package com.collections;

import java.util.HashSet;

public class CitySet {

	public static void main(String[] args) {

		HashSet<String> cities = new HashSet<>();

		cities.add("Hyderabad");
		cities.add("Chennai");
		cities.add("Delhi");
		cities.add("Hyderabad");
		cities.add("Mumbai");

		System.out.println("Cities");

		System.out.println(cities);

		System.out.println("Contains Delhi : " + cities.contains("Delhi"));

		System.out.println("Total Cities : " + cities.size());

	}
}
