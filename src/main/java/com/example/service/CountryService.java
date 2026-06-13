package com.example.service;

import java.util.List;


import com.example.entity.Country;

public interface CountryService {
	List<Country> fetchAll();
	Country fetchById(int id);
	void deleteById(int id);
	Country addData(Country country);
	Country updateData(Country country , int id);

}
