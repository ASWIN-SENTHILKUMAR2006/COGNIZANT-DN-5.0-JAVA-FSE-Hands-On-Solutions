package com.cognizant.spring_learn.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.model.Country;

/**
 * @author Aswin Senthilkumar
 *
 */
@RestController
public class  CountryController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    private final ApplicationContext context;

    
    public CountryController() {
        this.context = new ClassPathXmlApplicationContext("country.xml");
    }

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia() execution initialized.");
        
        // Retrieve the bean defined in country.xml using its ID "in"
        Country india = (Country) context.getBean("in");
        
        LOGGER.info("Retrieved Bean details: {}", india);
        LOGGER.info("END - getCountryIndia() execution completed successfully.");
        
        return india;
    }

}
