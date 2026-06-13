package com.example.service;

import java.util.List;


import com.example.entity.Category;

public interface CategoryService {
	List<Category> fetchAll();
	Category fetchById(int id);
	void deleteById(int id);
	Category addData(Category category);
	Category updateData(Category category , int id);

}
