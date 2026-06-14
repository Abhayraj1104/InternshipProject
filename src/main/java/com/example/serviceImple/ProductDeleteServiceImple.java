package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.ProductRepository;
import com.example.service.ProductDeleteService;

@Service
public class ProductDeleteServiceImple implements ProductDeleteService {

    @Autowired
    private ProductRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
