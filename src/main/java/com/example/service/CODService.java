package com.example.service;

import java.util.List;


import com.example.entity.COD;

public interface CODService {
	List<COD> fetchAll();
	COD fetchById(int id);
	void deleteById(int id);
	COD addData(COD cod);
	COD updateData(COD cod , int id);

}
