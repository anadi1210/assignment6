package com.merit.meritbank6.assignment6.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class AccountHolder {

static int counter = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_holder_id")
	protected int accountHolderId;
	
	@NotBlank(message = "first name is required")
	protected String firstName;
	
	protected String middleName;
	
	@NotBlank(message = "last name is required")
	protected String lastName;
	
	@NotBlank(message = "ssn is required")
	protected String SSN;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "account_holder_id", referencedColumnName = "account_holder_id")
	protected List<CheckingAccount> checkingAccountList;
		

	public List<CheckingAccount> getCheckingAccountList() {
		return checkingAccountList;
	}
	public void setCheckingAccountList(List<CheckingAccount> checkingAccountList) {
		this.checkingAccountList = checkingAccountList;
	}

	/*
	@OneToMany(cascade = CascadeType.ALL)
	protected List<SavingsAccount> savingsAccountsList;
	@OneToMany(cascade = CascadeType.ALL)
	protected List<CDAccount> cdAccountsList;
	*/	
	protected int numberOfCheckingAccounts;
	protected double checkingBalance;
	protected int numberOfSavingsAccounts;
	protected double savingsBalance;
	protected int numberOfCDAccounts;
	protected double cdBalance;
	protected double combinedBalance;
	
	public AccountHolder() {
			checkingAccountList = new ArrayList<CheckingAccount>();
		}
	AccountHolder(String firstName, String middleName, String lastName, String ssn) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.SSN = ssn;
	}

	/*
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
		checkingAccount.setOwnerId(this.getAccountId());
		checkingAccountsList.add(checkingAccount);
		return checkingAccount;
	}
	public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
		savingsAccount.setOwnerId(this.getAccountId());
		savingsAccountsList.add(savingsAccount);
		return savingsAccount;
	}
	public CDAccount addCDAccount(CDAccount cdAccount) {
		cdAccount.setOwnerId(this.getAccountId());
		cdAccountsList.add(cdAccount);
		return cdAccount;
	}
	*/
	public int getNumberOfCheckingAccounts() {
		return 0;
	}

	public double getCheckingBalance() {
		double checkingBalance = 0.0;
		
		return checkingBalance;
	}

	public int getNumberOfSavingsAccounts() {
		return 0;
	}

	public double getSavingsBalance() {
		double savingsBalance = 0.0;
		
		return savingsBalance;
	}

	public int getNumberOfCDAccounts() {
		return 0;
	}

	public double getCdBalance() {
		double cdBalance = 0.0;
		
		return cdBalance;
	}

	public double getCombinedBalance() {
		double totalBalance = getCdBalance() + getCheckingBalance() + getSavingsBalance();
		return totalBalance;
	}

	
	
	public int getAccountId() { return accountHolderId; }
	  
	public void setAccountId(int accountId) { this.accountHolderId = accountId; }
	  
	public String getFirstName() { return firstName; }
	  
	public void setFirstName(String firstName) { this.firstName = firstName; }
	  
	public String getMiddleName() { return middleName; }
	  
	public void setMiddleName(String middleName) { this.middleName = middleName; }
	  
	public String getLastName() { return lastName; }
	  
	public void setLastName(String lastName) { this.lastName = lastName; }
	  
	public String getSSN() { return SSN; }
	  
	public void setSSN(String sSN) { SSN = sSN; }
	 
}
