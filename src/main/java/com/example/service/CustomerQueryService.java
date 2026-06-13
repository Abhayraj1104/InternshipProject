package com.example.service;

import java.util.List;


import com.example.entity.CustomerQuery;

public interface CustomerQueryService {
	List<CustomerQuery> fetchAll();
	CustomerQuery fetchById(int id);
	void deleteById(int id);
	CustomerQuery addData(CustomerQuery customerQuery);
	CustomerQuery updateData(CustomerQuery customerQuery , int id);

}
