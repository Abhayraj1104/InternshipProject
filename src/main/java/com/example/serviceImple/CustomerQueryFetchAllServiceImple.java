package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CustomerQuery;
import com.example.repository.CustomerQueryRepository;
import com.example.service.CustomerQueryFetchAllService;

@Service
public class CustomerQueryFetchAllServiceImple implements CustomerQueryFetchAllService {

    @Autowired
    private CustomerQueryRepository repository;

    @Override
    public List<CustomerQuery> fetchAll() {
        return repository.findAll();
    }
}
