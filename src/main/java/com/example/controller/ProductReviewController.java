package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.ProductReview;
import com.example.service.ProductReviewCreateService;
import com.example.service.ProductReviewDeleteService;
import com.example.service.ProductReviewFetchAllService;
import com.example.service.ProductReviewFetchService;
import com.example.service.ProductReviewUpdateService;

@RestController
@RequestMapping("/productReview")
public class ProductReviewController {

    @Autowired
    private ProductReviewCreateService productReviewCreateService;

    @Autowired
    private ProductReviewDeleteService productReviewDeleteService;

    @Autowired
    private ProductReviewUpdateService productReviewUpdateService;

    @Autowired
    private ProductReviewFetchService productReviewFetchService;

    @Autowired
    private ProductReviewFetchAllService productReviewFetchAllService;

    @PostMapping("/save")
    public ProductReview saveProductReview(@RequestBody ProductReview productReview) {
        return productReviewCreateService.addData(productReview);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProductReview(@PathVariable Long id) {
        productReviewDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<ProductReview> fetchAllProductReview() {
        return productReviewFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public ProductReview fetchProductReview(@PathVariable Long id) {
        return productReviewFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public ProductReview updateProductReview(@RequestBody ProductReview productReview,
                                             @PathVariable Long id) {
        return productReviewUpdateService.updateData(productReview, id);
    }
}
