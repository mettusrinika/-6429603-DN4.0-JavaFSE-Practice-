package com.cognizant1.spring_learn1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearn1Application {


    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearn1Application.class);

    public static void displayCountry() {
        LOGGER.info("START");

        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        LOGGER.debug("Country: {}", country);
        context.close();

        LOGGER.info("END");
    }

    public static void main(String[] args) {
        LOGGER.info("Application Starting...");
        SpringApplication.run(SpringLearn1Application.class, args);
        LOGGER.info("Application Started.");
        
        displayCountry(); 
    }
}
