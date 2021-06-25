package com.merit.meritbank6.assignment6.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class AccountHoldersContactDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long accountHolderContactDetailsId;
	
	@NotBlank
	private String phoneNumber;
	
	@Email
	@NotBlank
	private String email;
	
	private String address;
	
	
	
	public AccountHoldersContactDetails() {
		
	}
	
	public long getAccountHolderContactDetailsId() {
		return accountHolderContactDetailsId;
	}
	public void setAccountHolderContactDetailsId(long accountHolderContactDetailsId) {
		this.accountHolderContactDetailsId = accountHolderContactDetailsId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
