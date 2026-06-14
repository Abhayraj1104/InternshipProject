package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.repository.OrderRepository;
import com.example.service.OrderFetchService;

@Service
public class OrderFetchServiceImple implements OrderFetchService {

    @Autowired
    private OrderRepository repository;

    @Override
    public Order fetchById(Long id) {
        return repository.findById(id).get();
    }
}
