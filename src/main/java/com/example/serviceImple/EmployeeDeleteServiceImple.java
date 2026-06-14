package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeDeleteService;

@Service
public class EmployeeDeleteServiceImple implements EmployeeDeleteService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public void deleteById(int id) {

        repository.deleteById(id);
    }
}