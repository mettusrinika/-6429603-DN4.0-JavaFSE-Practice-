package com.cognizant1.spring_learn1.controller;

import com.cognizant1.spring_learn1.Country;
import com.cognizant1.spring_learn1.exception.CountryNotFoundException;
import com.cognizant1.spring_learn1.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        LOGGER.info("START - /countries/" + code);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countryList = context.getBean("countryList", List.class);
        Country country = countryService.getCountry(countryList, code);
        context.close();
        LOGGER.info("END");
        return country;
    }
}