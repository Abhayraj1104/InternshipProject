package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.repository.CountryRepository;
import com.example.service.CountryUpdateService;

@Service
public class CountryUpdateServiceImple implements CountryUpdateService {
	@Autowired
	private CountryRepository countryRepo;

	@Override
	public Country updateData(Country country, int id) {
		Country c1 = countryRepo.findById(id).get();
		c1.setCountryName(country.getCountryName());
		return c1;
	}

}
