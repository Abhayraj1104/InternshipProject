package com.example.service;

import java.util.List;


import com.example.entity.CompanyResponse;

public interface CompanyResponseService {
	List<CompanyResponse> fetchAll();
	CompanyResponse fetchById(int id);
	void deleteById(int id);
	CompanyResponse addData(CompanyResponse companyResponse);
	CompanyResponse updateData(CompanyResponse companyResponse , int id);

}
