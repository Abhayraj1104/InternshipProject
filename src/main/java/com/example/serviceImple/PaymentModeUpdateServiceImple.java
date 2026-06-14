package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.PaymentMode;
import com.example.repository.PaymentModeRepository;
import com.example.service.PaymentModeUpdateService;

@Service
public class PaymentModeUpdateServiceImple implements PaymentModeUpdateService {

    @Autowired
    private PaymentModeRepository repository;

    @Override
    public PaymentMode updateData(PaymentMode paymentMode, int id) {

        PaymentMode existingPaymentMode =
                repository.findById(id).orElse(null);

        if (existingPaymentMode != null) {

            existingPaymentMode.setModeName(
                    paymentMode.getModeName());

            return repository.save(existingPaymentMode);
        }

        return null;
    }
}