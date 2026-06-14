package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.ManagerRepository;
import com.example.service.ManagerDeleteService;

@Service
public class ManagerDeleteServiceImple implements ManagerDeleteService {

    @Autowired
    private ManagerRepository repository;

    @Override
    public void deleteById(int id) {

        repository.deleteById(id);
    }
}