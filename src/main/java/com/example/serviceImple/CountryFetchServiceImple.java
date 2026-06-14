package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.repository.CountryRepository;
import com.example.service.CountryFetchService;

@Service
public class CountryFetchServiceImple implements CountryFetchService{
	@Autowired 
	private CountryRepository countryRepo;

	
	public Country fetchById(int id) {
		
		return countryRepo.findById(id).get();
	}

}
