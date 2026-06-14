package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CountryRepository;
import com.example.service.CountryDeleteService;

@Service
public class CountryDeleteServiceImple implements CountryDeleteService{
	
	@Autowired
    private CountryRepository repository;

	@Override
	public void deleteById(int id) {
		repository.deleteById(id);
		
	}

}
