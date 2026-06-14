package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PaymentMode;
import com.example.repository.PaymentModeRepository;
import com.example.service.PaymentModeFetchService;

@Service
public class PaymentModeFetchServiceImple implements PaymentModeFetchService {

    @Autowired
    private PaymentModeRepository repository;

    @Override
    public PaymentMode fetchById(int id) {
        return repository.findById(id).orElse(null);
    }
}