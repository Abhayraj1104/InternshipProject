package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ShippingDetails;
import com.example.repository.ShippingDetailsRepository;
import com.example.service.ShippingDetailsFetchService;

@Service
public class ShippingDetailsFetchServiceImple implements ShippingDetailsFetchService {

    @Autowired
    private ShippingDetailsRepository repository;

    @Override
    public ShippingDetails fetchById(Long id) {
        return repository.findById(id).get();
    }
}
