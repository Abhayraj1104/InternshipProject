package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.BrandRepository;
import com.example.service.BrandDeleteService;

@Service
public class BrandDeleteServiceImple implements BrandDeleteService {

    @Autowired
    private BrandRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
