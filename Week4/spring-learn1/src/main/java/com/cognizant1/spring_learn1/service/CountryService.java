package com.cognizant1.spring_learn1.service;

import com.cognizant1.spring_learn1.Country;
import com.cognizant1.spring_learn1.exception.CountryNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
	public Country getCountry(List<Country> countryList, String code) throws CountryNotFoundException {
        for (Country country : countryList) {
            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }
        }
        throw new CountryNotFoundException("Country with code " + code + " not found.");
    }

}
