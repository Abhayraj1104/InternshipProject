package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PaymentMode;
import com.example.repository.PaymentModeRepository;
import com.example.service.PaymentModeCreateService;

@Service
public class PaymentModeCreateServiceImple implements PaymentModeCreateService {

    @Autowired
    private PaymentModeRepository repository;

    @Override
    public PaymentMode addData(PaymentMode paymentMode) {
        return repository.save(paymentMode);
    }
}