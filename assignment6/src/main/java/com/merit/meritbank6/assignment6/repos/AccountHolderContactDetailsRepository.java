package com.merit.meritbank6.assignment6.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.merit.meritbank6.assignment6.model.AccountHoldersContactDetails;

public interface AccountHolderContactDetailsRepository
		extends JpaRepository<AccountHoldersContactDetails, Long> {

}
