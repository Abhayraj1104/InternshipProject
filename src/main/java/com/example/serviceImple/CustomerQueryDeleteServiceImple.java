package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CustomerQueryRepository;
import com.example.service.CustomerQueryDeleteService;

@Service
public class CustomerQueryDeleteServiceImple implements CustomerQueryDeleteService {

    @Autowired
    private CustomerQueryRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
