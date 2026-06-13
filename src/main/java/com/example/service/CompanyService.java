package com.example.service;

import java.util.List;


import com.example.entity.Company;

public interface CompanyService {
	List<Company> fetchAll();
	Company fetchById(int id);
	void deleteById(int id);
	Company addData(Company company);
	Company updateData(Company company , int id);

}
