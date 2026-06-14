package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CompanyType;

import com.example.repository.CompanysTypeRepository;

import com.example.service.TypeFetchService;
@Service
public class TypeFetchServiceImple implements TypeFetchService{
	 @Autowired
	    private CompanysTypeRepository repository;

	    @Override
	    public CompanyType fetchById(int id) {
	        return repository.findById(id).orElse(null);
	    }

}
