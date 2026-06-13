package com.example.service;

import java.util.List;


import com.example.entity.ProductReview;

public interface ProductReviewService {
	List<ProductReview> fetchAll();
	ProductReview fetchById(int id);
	void deleteById(int id);
	ProductReview addData(ProductReview productReview);
	ProductReview updateData(ProductReview productReview , int id);

}
