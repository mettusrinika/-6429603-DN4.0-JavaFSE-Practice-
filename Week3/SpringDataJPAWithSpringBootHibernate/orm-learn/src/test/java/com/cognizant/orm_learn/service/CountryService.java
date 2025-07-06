package com.cognizant.orm_learn.service;
import java.util.list;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
@Service
public class CountryService
{
	@AutoWired
	private CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries()
	{
		return countryRepository.findAll();
	}

}
