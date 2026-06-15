package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.repository.CountryRepository;
import com.example.service.CountryCreateService;
@Service
public class CountryCreateServiceImple implements CountryCreateService{

	@Autowired
    private CountryRepository repository;

	@Override
	public Country addData(Country country) {
	        return repository.save(country);
	}

}
