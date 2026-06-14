package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Owner;
import com.example.repository.OwnerRepository;
import com.example.service.OwnerFetchService;

@Service
public class OwnerFetchServiceImple implements OwnerFetchService {

    @Autowired
    private OwnerRepository repository;

    @Override
    public Owner fetchById(Long id) {
        return repository.findById(id).orElse(null);
    }
}