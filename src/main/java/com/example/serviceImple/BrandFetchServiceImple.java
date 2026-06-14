package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Brand;
import com.example.repository.BrandRepository;
import com.example.service.BrandFetchService;

@Service
public class BrandFetchServiceImple implements BrandFetchService {

    @Autowired
    private BrandRepository repository;

    @Override
    public Brand fetchById(Long id) {
        return repository.findById(id).get();
    }
}
