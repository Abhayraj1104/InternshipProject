package com.example.service;

import java.util.List;


import com.example.entity.SubCategory;

public interface SubCategoryService {
	List<SubCategory> fetchAll();
	SubCategory fetchById(int id);
	void deleteById(int id);
	SubCategory addData(SubCategory subCategory);
	SubCategory updateData(SubCategory subCategory , int id);

}
