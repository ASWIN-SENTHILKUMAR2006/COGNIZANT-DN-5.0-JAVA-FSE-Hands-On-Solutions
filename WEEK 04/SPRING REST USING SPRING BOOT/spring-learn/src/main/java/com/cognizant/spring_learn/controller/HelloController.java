package com.cognizant.spring_learn.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author Aswin Senthilkumar
 *
 */
@RestController
public class HelloController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("hello")
	public String sayHello() {
		LOGGER.info("Start of Hello Controller");
		
		LOGGER.info("End of Hello Controller");
		//return "hello.html";
		return "Hello World!!"; 

	}
}
