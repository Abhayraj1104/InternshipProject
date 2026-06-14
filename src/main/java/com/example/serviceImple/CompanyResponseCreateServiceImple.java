package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CompanyResponse;
import com.example.repository.CompanyResponseRepository;
import com.example.service.CompanyResponseCreateService;

@Service
public class CompanyResponseCreateServiceImple implements CompanyResponseCreateService {

    @Autowired
    private CompanyResponseRepository repository;

    @Override
    public CompanyResponse addData(CompanyResponse companyResponse) {
        return repository.save(companyResponse);
    }
}
