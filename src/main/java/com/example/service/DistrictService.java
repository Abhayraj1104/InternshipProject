package com.example.service;

import java.util.List;


import com.example.entity.District;

public interface DistrictService {
	List<District> fetchAll();
	District fetchById(int id);
	void deleteById(int id);
	District addData(District district);
	District updateData(District district , int id);

}
