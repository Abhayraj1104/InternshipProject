package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CompanyResponseRepository;
import com.example.service.CompanyResponseDeleteService;

@Service
public class CompanyResponseDeleteServiceImple implements CompanyResponseDeleteService {

    @Autowired
    private CompanyResponseRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
