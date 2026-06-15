package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.repository.CountryRepository;
import com.example.service.CountryFetchAllService;



@Service
public class CountryFetchAllServiceImple implements CountryFetchAllService{
	@Autowired
	private CountryRepository countryRepo;

	@Override
	public List<Country> fetchAll() {
		List<Country> Countries = countryRepo.findAll();
		return Countries;
	}



}
