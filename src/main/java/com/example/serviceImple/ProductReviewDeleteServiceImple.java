package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.ProductReviewRepository;
import com.example.service.ProductReviewDeleteService;

@Service
public class ProductReviewDeleteServiceImple implements ProductReviewDeleteService {

    @Autowired
    private ProductReviewRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
