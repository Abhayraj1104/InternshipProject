package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Owner;
import com.example.repository.OwnerRepository;
import com.example.service.OwnerFetchAllService;

@Service
public class OwnerFetchAllServiceImple implements OwnerFetchAllService {

    @Autowired
    private OwnerRepository repository;

    @Override
    public List<Owner> fetchAll() {
        return repository.findAll();
    }
}