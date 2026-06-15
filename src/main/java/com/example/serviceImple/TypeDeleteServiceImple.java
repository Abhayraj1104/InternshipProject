package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CompanysTypeRepository;
import com.example.service.TypeDeleteService;

@Service
public class TypeDeleteServiceImple implements TypeDeleteService {

    @Autowired
    private CompanysTypeRepository repository;

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}