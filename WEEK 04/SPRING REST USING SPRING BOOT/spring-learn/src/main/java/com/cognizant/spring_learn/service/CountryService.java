package com.cognizant.spring_learn.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.model.Country;

/**
 * @author Aswin Senthilkumar
 *
 */

@Service
public class CountryService {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);
	private final ApplicationContext context;

    public CountryService() {
       
        this.context = new ClassPathXmlApplicationContext("country.xml");
    }
	
	public Country getCountry (String code) {
		LOGGER.info("Started get Country by code --service function");
		Map<String, Country> countryBeans = context.getBeansOfType(Country.class);
        List<Country> countryList = new ArrayList<>(countryBeans.values());
        Country matchedCountry = null;
        
        
        for(Country country : countryList) {
        	if(country.getCode().equals(code)) {
        		matchedCountry = country;
        		break;
        	}
        }
        
		LOGGER.info("Ended get Country by code --service funcction");
		return matchedCountry;
	}

}
