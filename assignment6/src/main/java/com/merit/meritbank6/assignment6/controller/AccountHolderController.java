package com.merit.meritbank6.assignment6.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.merit.meritbank6.assignment6.model.AccountHolder;
import com.merit.meritbank6.assignment6.model.CDAccount;
import com.merit.meritbank6.assignment6.model.CheckingAccount;
import com.merit.meritbank6.assignment6.model.SavingsAccount;
import com.merit.meritbank6.assignment6.repos.AccountHolderRepository;
import com.merit.meritbank6.assignment6.repos.CDAccountRepository;
import com.merit.meritbank6.assignment6.repos.CheckingAccountRepository;
import com.merit.meritbank6.assignment6.repos.SavingsAccountRepository;
import com.merit.meritbank6.assignment6.service.AccountHolderService;

@RestController
public class AccountHolderController {

	//protected List<AccountHolder> accounHoldersList = new ArrayList<AccountHolder>();
	
	@Autowired AccountHolderRepository accountRepo;

	@Autowired
	CDAccountRepository cdAccountRepository;
	@Autowired
	CheckingAccountRepository checkingAccountRepository;
	@Autowired
	SavingsAccountRepository savingsAccountRepository;
	//@Autowired
	//AccountHolderService accountHolderService;
	
	@PostMapping("/AccountHolders")
	@ResponseStatus(HttpStatus.CREATED)
	public AccountHolder addAccountHolder(@RequestBody @Valid AccountHolder accountHolder) {
		
		accountRepo.save(accountHolder);
		return accountHolder;
	}
	
	@GetMapping("/AccountHolders")
	@ResponseStatus(HttpStatus.OK)
	public List<AccountHolder> getAccountHolders() {
		
		return accountRepo.findAll();
	}
	
	@GetMapping("/AccountHolders/{id}")
	@ResponseStatus(HttpStatus.OK)
	public AccountHolder getAccountHolder(@PathVariable (name = "id") int id) {
		
		return accountRepo.findById(id).get(); 
	}

	
	@PostMapping("/AccountHolders/{id}/CheckingAccounts")
	public CheckingAccount addCheckingAccount(@PathVariable int id, @RequestBody CheckingAccount ca) {
		
		//ca.setAccountHolder(accountRepo.getById(id));
		//checkingAccountRepository.save(ca);
		AccountHolder ah = accountRepo.findById(id).get();
		ah.setCheckingAccountList(Arrays.asList(ca));
		checkingAccountRepository.save(ca);
		
		accountRepo.save(ah);
		return ca;
	}
	
	/*
	@GetMapping("/AccountHolders/{id}/CheckingAccounts")
	public List<CheckingAccount> getCheckingAccount(@PathVariable int id) {
		
		//accounHoldersList.get(id-1).getCheckingAccountsList();
		
		return accounHoldersList.get(id-1).getCheckingAccountsList();
	}
	
	
	@PostMapping("/AccountHolders/{id}/SavingsAccounts")
	public SavingsAccount addSavingsAccount(@PathVariable int id, @RequestBody SavingsAccount sa) {
		
		accounHoldersList.get(id-1).getSavingsAccountsList().add(sa);
		
		return sa;
	}
	
	
	@GetMapping("/AccountHolders/{id}/SavingsAccount")
	public List<SavingsAccount> getSavingsAccount(@PathVariable int id) {
		
		return accounHoldersList.get(id-1).getSavingsAccountsList();
	}
	
	@PostMapping("/AccountHolders/{id}/CDAccounts")
	public CDAccount addCDAccount(@PathVariable int id, @RequestBody CDAccount cdAccount) {
		
		//cdAccount.setCdOffering(cdAccount.getCdOffering().getCdOffereingId());
		
		
		
		//cdAccount.setCdOffering(CDOffering.getCDOfferingList().get(cdAccount.getCdOffering().getCdOffereingId() - 1));
		
		accounHoldersList.get(id-1).getCdAccountsList().add(cdAccount);
		
		return cdAccount;
	}
	
	
	@GetMapping("/AccountHolders/{id}/CDAccounts")
	public List<CDAccount> getCDAccount(@PathVariable int id) {
		
		return accounHoldersList.get(id-1).getCdAccountsList();
	}
	
	
	public List<AccountHolder> getAccounHoldersList() {
		return accounHoldersList;
	}

	public void setAccounHoldersList(List<AccountHolder> accounHoldersList) {
		this.accounHoldersList = accounHoldersList;
	}
	*/
}
