package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.repository.AddressRepository;
import com.example.service.AddressFetchAllService;

@Service
public class AddressFetchAllServiceImple
        implements AddressFetchAllService {

    @Autowired
    private AddressRepository repository;

    @Override
    public List<Address> fetchAll() {
        return repository.findAll();
    }
}