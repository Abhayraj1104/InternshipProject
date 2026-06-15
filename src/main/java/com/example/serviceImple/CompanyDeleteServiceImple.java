package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CompanyRepository;
import com.example.service.CompanyDeleteService;

@Service
public class CompanyDeleteServiceImple
        implements CompanyDeleteService {

    @Autowired
    private CompanyRepository repository;

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }


}