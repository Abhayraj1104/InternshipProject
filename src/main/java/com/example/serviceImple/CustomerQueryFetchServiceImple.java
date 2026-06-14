package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CustomerQuery;
import com.example.repository.CustomerQueryRepository;
import com.example.service.CustomerQueryFetchService;

@Service
public class CustomerQueryFetchServiceImple implements CustomerQueryFetchService {

    @Autowired
    private CustomerQueryRepository repository;

    @Override
    public CustomerQuery fetchById(Long id) {
        return repository.findById(id).get();
    }
}
