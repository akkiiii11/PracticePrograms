package com.interfacedemo;

interface Account
{
	void deposit(double amount);
	
	void withdraw(double amount);
	
	double getBalance();
}

class SavingAccount implements Account
{
	private double balance;
	private double interestRate;
	
	
	public SavingAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.interestRate = interestRate;
	}


	@Override
	public void deposit(double amount) {

		balance += amount;
		
	}


	@Override
	public void withdraw(double amount) {

		if(amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}


	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
		
	
	
}

class CurrentAccount implements Account
{
	private double balance;
	private double overdraftLimit;
	
	
	public CurrentAccount(double balance, double interestRate) {
		super();
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}


	@Override
	public void deposit(double amount) {

		balance += amount;
		
	}


	@Override
	public void withdraw(double amount) {

		if(amount <= balance)
		{
			balance = balance - amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		
	}


	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	
	
	
	
}

public class BankMain {

	public static void main(String[] args) {
		
		SavingAccount SA = new SavingAccount(2000, 20);
		SA.deposit(500);
		
		System.out.println("Saving Account Balance: "+SA.getBalance());
		
		CurrentAccount CA = new CurrentAccount(1000,100);
		CA.deposit(500);
		
		System.out.println("Saving Account Balance: "+CA.getBalance());

	}

}
