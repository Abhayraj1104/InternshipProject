package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CompanyResponse;
import com.example.repository.CompanyResponseRepository;
import com.example.service.CompanyResponseFetchAllService;

@Service
public class CompanyResponseFetchAllServiceImple implements CompanyResponseFetchAllService {

    @Autowired
    private CompanyResponseRepository repository;

    @Override
    public List<CompanyResponse> fetchAll() {
        return repository.findAll();
    }
}
