package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Manager;
import com.example.repository.ManagerRepository;
import com.example.service.ManagerFetchAllService;

@Service
public class ManagerFetchAllServiceImple implements ManagerFetchAllService {

    @Autowired
    private ManagerRepository repository;

    @Override
    public List<Manager> fetchAll() {

        return repository.findAll();
    }
}