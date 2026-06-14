package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ProductReview;
import com.example.repository.ProductReviewRepository;
import com.example.service.ProductReviewFetchService;

@Service
public class ProductReviewFetchServiceImple implements ProductReviewFetchService {

    @Autowired
    private ProductReviewRepository repository;

    @Override
    public ProductReview fetchById(Long id) {
        return repository.findById(id).get();
    }
}
