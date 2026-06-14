package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CompanyResponse;
import com.example.repository.CompanyResponseRepository;
import com.example.service.CompanyResponseFetchService;

@Service
public class CompanyResponseFetchServiceImple implements CompanyResponseFetchService {

    @Autowired
    private CompanyResponseRepository repository;

    @Override
    public CompanyResponse fetchById(Long id) {
        return repository.findById(id).get();
    }
}
