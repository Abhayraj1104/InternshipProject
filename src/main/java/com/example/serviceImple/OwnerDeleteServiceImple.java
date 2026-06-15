package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.OwnerRepository;
import com.example.service.OwnerDeleteService;

@Service
public class OwnerDeleteServiceImple implements OwnerDeleteService {

    @Autowired
    private OwnerRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }


}