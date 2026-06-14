package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.ShippingDetailsRepository;
import com.example.service.ShippingDetailsDeleteService;

@Service
public class ShippingDetailsDeleteServiceImple implements ShippingDetailsDeleteService {

    @Autowired
    private ShippingDetailsRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
