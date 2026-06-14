package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductFetchAllService;

@Service
public class ProductFetchAllServiceImple implements ProductFetchAllService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> fetchAll() {
        return repository.findAll();
    }
}
