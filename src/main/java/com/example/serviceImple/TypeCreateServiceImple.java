package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CompanyType;
import com.example.repository.CompanysTypeRepository;
import com.example.service.TypeCreateService;

@Service
public class TypeCreateServiceImple  implements TypeCreateService{
	  @Autowired
	    private CompanysTypeRepository repository;

	    @Override
	    public CompanyType addData(CompanyType type) {
	        return repository.save(type);
	    }





}
