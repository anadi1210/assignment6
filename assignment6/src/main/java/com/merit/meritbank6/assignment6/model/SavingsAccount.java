package com.merit.meritbank6.assignment6.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavingsAccount extends BankAccount{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long savingsAccountId;
	protected static double savingsInterestRate;
	public SavingsAccount() {
		super();
		savingsInterestRate = 0.01;
	}
	
	SavingsAccount(double openingBalance){
		super(openingBalance,savingsInterestRate);
	}
	
	/*
	SavingsAccount(double balance, double interestRate){
		super(balance,interestRate);
	}
	
	
	 * SavingsAccount(double balance, double interestRate, Date accountOpenedOn) {
	 * super(balance,interestRate,accountOpenedOn); } SavingsAccount(long
	 * accountNumber, double balance, double interestRate, Date accountOpenedOn) {
	 * super(accountNumber,balance,interestRate,accountOpenedOn); }
	 */
}
