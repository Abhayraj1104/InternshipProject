package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ProductReview;
import com.example.repository.ProductReviewRepository;
import com.example.service.ProductReviewFetchAllService;

@Service
public class ProductReviewFetchAllServiceImple implements ProductReviewFetchAllService {

    @Autowired
    private ProductReviewRepository repository;

    @Override
    public List<ProductReview> fetchAll() {
        return repository.findAll();
    }
}
