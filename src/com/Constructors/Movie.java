package com.Constructors;

public class Movie {
	String name;
	String director;
	String hero;
	String heroin;
	double budget;
	String gross;
	String comdiean;
	String villan;
	String releaseDate;
	String producer;

	public Movie(String director, double budget) {
		this.director = director;
		this.budget = budget;
	}

	public Movie(String hero, String name,String herion) {
		this.hero = hero;
		this.name = name;
		this.heroin=herion;
	}

	public Movie(String heroin) {
		this.heroin = heroin;

	}

	public Movie(Movie m1, Movie m2) {
		this.director = m1.director;
		this.budget = m1.budget;
		this.hero = m2.hero;
		this.name = m2.name;
	   ;

	}

	public Movie(Movie m, String gross, String comdiean) {
		this.director = m.director;
		this.budget = m.budget;
		this.hero = m.hero;
		this.name = m.name;
		this.heroin = m.heroin;
		this.gross = gross;
		this.comdiean = comdiean;
	}

	public Movie(Movie m, String gross, String comedian, String villan, String releaseDate, String producer) {

		this.director = m.director;
		this.budget = m.budget;
		this.hero = m.hero;
		this.name = m.name;
		this.heroin = m.heroin;

		this.gross = gross;
		this.comdiean = comedian;
		this.villan = villan;
		this.releaseDate = releaseDate;
		this.producer = producer;
	}

	public static void main(String[] args) {
		System.out.println("Details of the movie");
		Movie m1 = new Movie("rajmouli", 50000000.00);
		System.out.println("name of the director" + m1.director);
		System.out.println("budget for the movie :" + m1.budget);
		System.out.println("############");
		Movie m2 = new Movie("prabhas", "bahubali","anushka");
		System.out.println("name of the hero  :" + m2.hero);
		System.out.println("name of the movie :" + m2.name);
		System.out.println("name of the herion :" + m2.heroin);
		System.out.println("############");
		
		System.out.println("############");
		Movie m4 = new Movie(m1,m2);
		m4.show();
		Movie m3 = new Movie(m4, "100cr", "Brahmanandam", "chandu", "10-07-2015", "Shobu Yarlagadda");
		 m3.show();

	}

	void show() {
		System.out.println("Name of the movie  :" + name);
		System.out.println("Name of the director  :" + director);
		System.out.println("Name of the hero  :" + hero);
		System.out.println("Name of the heroin  :" + heroin);
		System.out.println("Name of the budget  :" + budget);
		System.out.println("collection of the gross :" + gross);
		System.out.println("Name of the comdiean  :" + comdiean);
		System.out.println("name of the villan  :" + villan);
		System.out.println("Release Date: " + releaseDate);
		System.out.println("Producer: " + producer);
	}

}


