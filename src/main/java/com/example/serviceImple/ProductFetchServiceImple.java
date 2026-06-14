package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductFetchService;

@Service
public class ProductFetchServiceImple implements ProductFetchService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product fetchById(Long id) {
        return repository.findById(id).get();
    }
}
