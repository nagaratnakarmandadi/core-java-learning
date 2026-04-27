package com.Constructors;

public class Movie {
	String name;
	String director;
	String hero;
	String heroin;
	double budget;
	String gross;

	public Movie(String director, double budget) {
		this.director = director;
		this.budget = budget;
	}

	public Movie(String hero, String name) {
		this.hero = hero;
		this.name = name;
	}

	public Movie(String heroin) {
		this.heroin = heroin;

	}

	public Movie(Movie m1, Movie m2, String heroin) {
		this.director = m1.director;
		this.budget = m1.budget;
		this.hero = m2.hero;
		this.name = m2.name;
		this.heroin = heroin;

	}

	public Movie(Movie m, String gross) {
		this.director = m.director;
		this.budget = m.budget;
		this.hero = m.hero;
		this.name = m.name;
		this.heroin = m.heroin;
		this.gross = gross;
	}

	public static void main(String[] args) {
		System.out.println("Details of the movie");
		Movie m1 = new Movie("rajmouli", 50000000.00);
		System.out.println("name of the director" + m1.director);
		System.out.println("budget for the movie :" + m1.budget);
		System.out.println("############");
		Movie m2 = new Movie("prabhas", "bahubali");
		System.out.println("name of the hero  :" + m2.hero);
		System.out.println("name of the movie :" + m2.name);
		System.out.println("############");
		Movie m = new Movie(m1, m2, "anushka");
		m.show();
		Movie m3 = new Movie(m, "100cr");
		m3.show();

	}

	void show() {
		System.out.println("Name of the movie  :" + name);
		System.out.println("Name of the director  :" + director);
		System.out.println("Name of the hero  :" + hero);
		System.out.println("Name of the heroin  :" + heroin);
		System.out.println("Name of the budget  :" + budget);
		System.out.println("collection of the gross :" + gross);
	}

}
