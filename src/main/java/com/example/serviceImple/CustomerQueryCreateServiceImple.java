package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CustomerQuery;
import com.example.repository.CustomerQueryRepository;
import com.example.service.CustomerQueryCreateService;

@Service
public class CustomerQueryCreateServiceImple implements CustomerQueryCreateService {

    @Autowired
    private CustomerQueryRepository repository;

    @Override
    public CustomerQuery addData(CustomerQuery customerQuery) {
        return repository.save(customerQuery);
    }
}
