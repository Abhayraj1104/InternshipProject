package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import com.example.service.ProductCreateService;

@Service
public class ProductCreateServiceImple implements ProductCreateService {

    @Autowired
    private ProductRepository repository;

    @Override
    public Product addData(Product product) {
        return repository.save(product);
    }
}
