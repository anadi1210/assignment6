package com.merit.meritbank6.assignment6.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.merit.meritbank6.assignment6.model.CDAccount;
import com.merit.meritbank6.assignment6.model.CheckingAccount;
import com.merit.meritbank6.assignment6.model.SavingsAccount;
import com.merit.meritbank6.assignment6.repos.AccountHolderRepository;
import com.merit.meritbank6.assignment6.repos.CDAccountRepository;
import com.merit.meritbank6.assignment6.repos.CheckingAccountRepository;
import com.merit.meritbank6.assignment6.repos.SavingsAccountRepository;

public class AccountHolderService {
	@Autowired
	AccountHolderRepository accHolderRepository;
	@Autowired
	CDAccountRepository cdAccountRepository;
	@Autowired
	CheckingAccountRepository checkingAccountRepository;
	@Autowired
	SavingsAccountRepository savingsAccountRepository;
	
	public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount, int id) {
		//checkingAccount.setAccountHolder(accHolderRepository.getById(id));
		checkingAccountRepository.save(checkingAccount);
		return checkingAccount;
	}
	/*
	 * public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
	 * 
	 * } public CDAccount addCDAccount(CDAccount cdAccount) {
	 * 
	 * }
	 */
}
