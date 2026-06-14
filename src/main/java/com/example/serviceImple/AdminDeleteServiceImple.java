package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.AdminRepository;
import com.example.service.AdminDeleteService;

@Service
public class AdminDeleteServiceImple
        implements AdminDeleteService {

    @Autowired
    private AdminRepository repository;

    @Override
    public void deleteById(int id) {

        repository.deleteById(id);
    }
}
