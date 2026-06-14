package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.OrderRepository;
import com.example.service.OrderDeleteService;

@Service
public class OrderDeleteServiceImple implements OrderDeleteService {

    @Autowired
    private OrderRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
