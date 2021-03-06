package com.merit.meritbank6.assignment6.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.merit.meritbank6.assignment6.model.CDOffering;
import com.merit.meritbank6.assignment6.repos.CDOfferingRepository;


@RestController
public class CDOfferingController {

	@Autowired
	CDOfferingRepository cdofferingRepo;
	
	@PostMapping("/CDOfferings")
	@ResponseStatus(HttpStatus.CREATED)
	public CDOffering addCDOfferings(@RequestBody @Valid CDOffering cdOffering) {
		
		cdofferingRepo.save(cdOffering);
		return cdOffering;
	}
	
	@GetMapping("/CDOfferings")
	@ResponseStatus(HttpStatus.OK)
	public List<CDOffering> getCDOfferings() {
		List<CDOffering> list = cdofferingRepo.findAll();
		return list;
	}
}
