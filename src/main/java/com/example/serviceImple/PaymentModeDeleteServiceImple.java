package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.PaymentModeRepository;
import com.example.service.PaymentModeDeleteService;

@Service
public class PaymentModeDeleteServiceImple implements PaymentModeDeleteService {

    @Autowired
    private PaymentModeRepository repository;

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}