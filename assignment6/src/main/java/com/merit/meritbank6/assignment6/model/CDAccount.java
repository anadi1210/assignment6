package com.merit.meritbank6.assignment6.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CDAccount extends BankAccount{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cdAccountId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	CDOffering cdOffering;
 	public CDAccount() {
		
	}
 	CDAccount(CDOffering offering, double balance){
		this.cdOffering = offering;
		super.balance = balance;
	}
	public CDOffering getCdOffering() {
		return cdOffering;
	}
	public void setCdOffering(CDOffering cdOffering) {
		this.cdOffering = cdOffering;
	}
	
}
