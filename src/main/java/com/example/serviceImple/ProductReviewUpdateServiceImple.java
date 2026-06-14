package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.entity.ProductReview;
import com.example.entity.User;
import com.example.repository.ProductRepository;
import com.example.repository.ProductReviewRepository;
import com.example.repository.UserRepository;
import com.example.service.ProductReviewUpdateService;

@Service
public class ProductReviewUpdateServiceImple implements ProductReviewUpdateService {

    @Autowired
    private ProductReviewRepository productReviewRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ProductReview updateData(ProductReview productReview, Long id) {
        ProductReview existingReview = productReviewRepository.findById(id).orElse(null);
        if (existingReview != null) {
            existingReview.setRating(productReview.getRating());
            existingReview.setReview(productReview.getReview());

            if (productReview.getProduct() != null && productReview.getProduct().getProductId() != null) {
                Product product = productRepository.findById(productReview.getProduct().getProductId()).orElse(null);
                existingReview.setProduct(product);
            }

            if (productReview.getUser() != null) {
                User user = userRepository.findById(productReview.getUser().getId()).orElse(null);
                existingReview.setUser(user);
            }

            return productReviewRepository.save(existingReview);
        }
        return null;
    }
}
