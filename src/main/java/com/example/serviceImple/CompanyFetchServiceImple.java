package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Company;
import com.example.repository.CompanyRepository;
import com.example.service.CompanyFetchService;

@Service
public class CompanyFetchServiceImple
        implements CompanyFetchService {

    @Autowired
    private CompanyRepository repository;

    @Override
    public Company fetchById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
