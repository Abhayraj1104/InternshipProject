package com.example.service;

import java.util.List;


import com.example.entity.Taluka;

public interface TalukaService {
	List<Taluka> fetchAll();
	Taluka fetchById(int id);
	void deleteById(int id);
	Taluka addData(Taluka taluka);
	Taluka updateData(Taluka taluka , int id);

}
