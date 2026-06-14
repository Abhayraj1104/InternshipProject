package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Owner;
import com.example.repository.OwnerRepository;
import com.example.service.OwnerCreateService;

@Service
public class OwnerCreateServiceImple implements OwnerCreateService {

    @Autowired
    private OwnerRepository repository;

    @Override
    public Owner addData(Owner owner) {
        return repository.save(owner);
    }
}