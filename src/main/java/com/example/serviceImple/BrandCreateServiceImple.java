package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Brand;
import com.example.repository.BrandRepository;
import com.example.service.BrandCreateService;

@Service
public class BrandCreateServiceImple implements BrandCreateService {

    @Autowired
    private BrandRepository repository;

    @Override
    public Brand addData(Brand brand) {
        return repository.save(brand);
    }
}
