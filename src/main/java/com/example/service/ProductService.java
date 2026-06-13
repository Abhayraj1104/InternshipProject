package com.example.service;

import java.util.List;


import com.example.entity.Product;

public interface ProductService {
	List<Product> fetchAll();
	Product fetchById(int id);
	void deleteById(int id);
	Product addData(Product product);
	Product updateData(Product product , int id);

}
