package com.example.service;

import java.util.List;


import com.example.entity.Town;

public interface TownService {
	List<Town> fetchAll();
	Town fetchById(int id);
	void deleteById(int id);
	Town addData(Town town);
	Town updateData(Town town , int id);

}
