package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ShippingDetails;
import com.example.repository.ShippingDetailsRepository;
import com.example.service.ShippingDetailsCreateService;

@Service
public class ShippingDetailsCreateServiceImple implements ShippingDetailsCreateService {

    @Autowired
    private ShippingDetailsRepository repository;

    @Override
    public ShippingDetails addData(ShippingDetails shippingDetails) {
        return repository.save(shippingDetails);
    }
}
