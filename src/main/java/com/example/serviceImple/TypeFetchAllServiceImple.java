package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CompanyType;

import com.example.repository.CompanysTypeRepository;

import com.example.service.TypeFetchAllService;

@Service
public class TypeFetchAllServiceImple implements TypeFetchAllService {

    @Autowired
    private CompanysTypeRepository repository;

    @Override
    public List<CompanyType> fetchAll() {
        return repository.findAll();
    }
}