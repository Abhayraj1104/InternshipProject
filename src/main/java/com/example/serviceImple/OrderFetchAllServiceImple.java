package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.repository.OrderRepository;
import com.example.service.OrderFetchAllService;

@Service
public class OrderFetchAllServiceImple implements OrderFetchAllService {

    @Autowired
    private OrderRepository repository;

    @Override
    public List<Order> fetchAll() {
        return repository.findAll();
    }
}
