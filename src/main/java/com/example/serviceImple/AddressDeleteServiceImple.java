package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.AddressRepository;
import com.example.service.AddressDeleteService;

@Service
public class AddressDeleteServiceImple
        implements AddressDeleteService {

    @Autowired
    private AddressRepository repository;

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
