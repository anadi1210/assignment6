package com.merit.meritbank6.assignment6.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
public class CDOffering {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cdOffereing_Id;
	
	@NotNull(message = "Term is required")
	@Positive(message = "Term value should be positive")
	@Min(value = 1, message = "Term should be atleast 1 year or more")
	private int cdOffereing_term;
	
	@NotNull(message = "Interest Rate is required")
	@Positive(message = "Interest Rate must be positive")
	@Max(value = 1, message = "Interest Rate value should be less than 1")
	private double cdOffereing_interestRate;
	
	public CDOffering() {
		
	}
	
		
	public int getCdOffereing_Id() {
		return cdOffereing_Id;
	}
	public void setCdOffereing_Id(int cdOffereing_Id) {
		this.cdOffereing_Id = cdOffereing_Id;
	}
	public int getCdOffereing_term() {
		return cdOffereing_term;
	}
	public void setCdOffereing_term(int cdOffereing_term) {
		this.cdOffereing_term = cdOffereing_term;
	}
	public double getCdOffereing_interestRate() {
		return cdOffereing_interestRate;
	}
	public void setCdOffereing_interestRate(double cdOffereing_interestRate) {
		this.cdOffereing_interestRate = cdOffereing_interestRate;
	}
	
	
}
