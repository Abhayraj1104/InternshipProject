package com.example.service;

import java.util.List;


import com.example.entity.Upi;

public interface UpiService {
	List<Upi> fetchAll();
	Upi fetchById(int id);
	void deleteById(int id);
	Upi addData(Upi upi);
	Upi updateData(Upi upi , int id);

}
