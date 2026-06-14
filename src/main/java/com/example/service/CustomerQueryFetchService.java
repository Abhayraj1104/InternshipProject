package com.example.service;

import com.example.entity.CustomerQuery;

public interface CustomerQueryFetchService {
	CustomerQuery fetchById(Long id);

}
