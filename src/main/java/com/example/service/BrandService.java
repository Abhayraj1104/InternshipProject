package com.example.service;

import java.util.List;
import com.example.entity.Brand;

public interface BrandService {
	List<Brand> fetchAll();
	Brand fetchById(int id);
	void deleteById(int id);
	Brand addData(Brand brand);
	Brand updateData(Brand brand , int id);

}
