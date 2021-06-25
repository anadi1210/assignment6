package com.merit.meritbank6.assignment6.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import net.bytebuddy.implementation.bind.annotation.Super;

@Entity
public class CheckingAccount extends BankAccount{
	
	protected static double checkingInterestRate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long checkingAccountId;
	
	@Column(name = "account_holder_id")
	private int accountHolderId;
	
	public int getAccountHolderId() {
		return accountHolderId;
	}

	public static double getCheckingInterestRate() {
		return checkingInterestRate;
	}

	public static void setCheckingInterestRate(double checkingInterestRate) {
		CheckingAccount.checkingInterestRate = checkingInterestRate;
	}

	public void setAccountHolderId(int accountHolderId) {
		this.accountHolderId = accountHolderId;
	}

	public CheckingAccount() {
		super();
		checkingInterestRate = 0.0001;
	}
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL) private AccountHolder accountHolder;
	 */
	
	
	public long getCheckingAccountId() {
		return checkingAccountId;
	}


	public void setCheckingAccountId(long checkingAccountId) {
		this.checkingAccountId = checkingAccountId;
	}


	/*
	 * public AccountHolder getAccountHolder() { return accountHolder; }
	 * 
	 * 
	 * public void setAccountHolder(AccountHolder accountHolder) {
	 * this.accountHolder = accountHolder; }
	 */


	public CheckingAccount(double openingBalance) {
		super(openingBalance, checkingInterestRate);
	}
	
	/*
	 * CheckingAccount(double balance, double interestRate){
	 * super(balance,interestRate); } CheckingAccount(double balance, double
	 * interestRate, Date accountOpenedOn) {
	 * super(balance,interestRate,accountOpenedOn); } CheckingAccount(long
	 * accountNumber, double balance, double interestRate, Date accountOpenedOn) {
	 * super(accountNumber,balance,interestRate,accountOpenedOn); }
	 */
}
