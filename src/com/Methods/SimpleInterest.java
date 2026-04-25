package com.Methods;

import java.util.Scanner;

public class SimpleInterest {

    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal, Rate, Time:");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        System.out.println("Simple Interest: " + calculateSI(p, r, t));

        sc.close();
    }
}