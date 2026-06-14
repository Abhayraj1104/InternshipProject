package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.repository.AddressRepository;
import com.example.service.AddressFetchService;

@Service
public class AddressFetchServiceImple
        implements AddressFetchService {

    @Autowired
    private AddressRepository repository;

    @Override
    public Address fetchById(int id) {
        return repository.findById(id).orElse(null);
    }

	
}
