package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Manager;
import com.example.repository.ManagerRepository;
import com.example.service.ManagerFetchService;

@Service
public class ManagerFetchServiceImple implements ManagerFetchService {

    @Autowired
    private ManagerRepository repository;

    @Override
    public Manager fetchById(int id) {

        return repository.findById(id)
                         .orElse(null);
    }
}