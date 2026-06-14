package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.repository.OrderRepository;
import com.example.service.OrderCreateService;

@Service
public class OrderCreateServiceImple implements OrderCreateService {

    @Autowired
    private OrderRepository repository;

    @Override
    public Order addData(Order order) {
        return repository.save(order);
    }
}
