package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PaymentMode;
import com.example.repository.PaymentModeRepository;
import com.example.service.PaymentModeFetchAllService;

@Service
public class PaymentModeFetchAllServiceImple implements PaymentModeFetchAllService {

    @Autowired
    private PaymentModeRepository repository;

    @Override
    public List<PaymentMode> fetchAll() {
        return repository.findAll();
    }
}