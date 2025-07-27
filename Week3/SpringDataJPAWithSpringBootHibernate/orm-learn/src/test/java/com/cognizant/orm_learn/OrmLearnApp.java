package com.cognizant.orm_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApp
{
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApp.class);
	private static CountryService countryService;
	public static void main(String[] args)
	{
		SpringApplication.run(OrmLearnApp.class, args);
		ApplicationContext context = SpringApplication.run(OrmLearnApp.class, args);
	    countryService = context.getBean(CountryService.class);
	    testGetAllCountries();
		LOGGER.info("Inside Main");	
	}
private static void testGetAllCountries()
{
	LOGGER.info("start");
	List<Country> countries = countryService.getAllCountries();
	LOGGER.debug("countries={}",countries);
	LOGGER.info("end");
}
}
