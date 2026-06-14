package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.example.repository.AdminRepository;
import com.example.service.AdminFetchAllService;

@Service
public class AdminFetchAllServiceImple
        implements AdminFetchAllService {

    @Autowired
    private AdminRepository repository;

    @Override
    public List<Admin> fetchAll() {

        return repository.findAll();
    }
}