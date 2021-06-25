package com.merit.meritbank6.assignment6.model;

import java.util.Date;

public class BankAccount {

	//static int counter = 1;
	protected long bankAccountId;
	protected double balance;
	protected double interestRate;
	protected Date openedOn;
	
	//protected int ownerId;

	
	
	public BankAccount() {
		//this.accountNumber = counter++;
		this.openedOn = new Date();
	}
	
	BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
		
	}

	BankAccount(double balance, double interestRate, 
					Date accountOpenedOn) {
		this.balance = balance;
		this.interestRate = interestRate;
		this.openedOn = accountOpenedOn;
		//this.accountNumber = counter++;
	}
	BankAccount(long accountNumber, double balance, 
			double interestRate, Date accountOpenedOn) {
		//this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.openedOn = accountOpenedOn;
	}

	public long getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public Date getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(Date openedOn) {
		this.openedOn = openedOn;
	}
	
	
}
