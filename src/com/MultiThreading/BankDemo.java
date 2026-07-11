package com.MultiThreading;

class Bank {

	private int balance;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
}

class Deposit implements Runnable {

	Bank bank;

	Deposit(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {

		bank.setBalance(bank.getBalance() + 5000);

		System.out.println("After Deposit : " + bank.getBalance());
	}
}

class Withdraw implements Runnable {

	Bank bank;

	Withdraw(Bank bank) {
		this.bank = bank;
	}

	@Override
	public void run() {

		bank.setBalance(bank.getBalance() - 2000);

		System.out.println("After Withdraw : " + bank.getBalance());
	}
}

public class BankDemo {

	public static void main(String[] args) {

		Bank bank = new Bank();

		bank.setBalance(10000);

		Thread t1 = new Thread(new Deposit(bank), "Deposit Thread");
		Thread t2 = new Thread(new Withdraw(bank), "Withdraw Thread");

		t1.start();
		t2.start();
	}
}
