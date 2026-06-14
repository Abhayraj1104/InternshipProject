package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.ShippingDetails;
import com.example.repository.ShippingDetailsRepository;
import com.example.service.ShippingDetailsFetchAllService;

@Service
public class ShippingDetailsFetchAllServiceImple implements ShippingDetailsFetchAllService {

    @Autowired
    private ShippingDetailsRepository repository;

    @Override
    public List<ShippingDetails> fetchAll() {
        return repository.findAll();
    }
}
