package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Brand;
import com.example.repository.BrandRepository;
import com.example.service.BrandFetchAllService;

@Service
public class BrandFetchAllServiceImple implements BrandFetchAllService {

    @Autowired
    private BrandRepository repository;

    @Override
    public List<Brand> fetchAll() {
        return repository.findAll();
    }
}
