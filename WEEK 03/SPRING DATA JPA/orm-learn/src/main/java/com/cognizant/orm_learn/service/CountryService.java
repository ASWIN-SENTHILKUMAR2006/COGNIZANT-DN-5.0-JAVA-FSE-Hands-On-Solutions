package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

/**
 * @author Aswin Senthilkumar
 *
 */
@Service
public class CountryService {

	@Autowired
	CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries(){
		List<Country> countries =  countryRepository.findAll();
		return countries;
	}
	
}
