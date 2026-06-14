package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.example.repository.AdminRepository;
import com.example.service.AdminFetchService;

@Service
public class AdminFetchServiceImple
        implements AdminFetchService {

    @Autowired
    private AdminRepository repository;

    @Override
    public Admin fetchById(int id) {

        return repository.findById(id)
                         .orElse(null);
    }
}