package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CompanyType;

import com.example.repository.CompanysTypeRepository;

import com.example.service.TypeUpdateService;

@Service
public class TypeUpdateServiceImple implements TypeUpdateService {

    @Autowired
    private CompanysTypeRepository repository;

    @Override
    public CompanyType updateData(CompanyType type, int id) {

        CompanyType existingType = repository.findById(id).orElse(null);

        if(existingType != null) {
            existingType.setTypeName(type.getTypeName());
            return repository.save(existingType);
        }

        return null;
    }
}