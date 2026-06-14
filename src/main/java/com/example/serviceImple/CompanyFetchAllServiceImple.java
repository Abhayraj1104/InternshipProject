package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Company;
import com.example.repository.CompanyRepository;
import com.example.service.CompanyFetchAllService;

@Service
public class CompanyFetchAllServiceImple
        implements CompanyFetchAllService {

    @Autowired
    private CompanyRepository repository;

    @Override
    public List<Company> fetchAll() {
        return repository.findAll();
    }
}
