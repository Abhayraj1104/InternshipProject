package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ProductReview;
import com.example.repository.ProductReviewRepository;
import com.example.service.ProductReviewCreateService;

@Service
public class ProductReviewCreateServiceImple implements ProductReviewCreateService {

    @Autowired
    private ProductReviewRepository repository;

    @Override
    public ProductReview addData(ProductReview productReview) {
        return repository.save(productReview);
    }
}
