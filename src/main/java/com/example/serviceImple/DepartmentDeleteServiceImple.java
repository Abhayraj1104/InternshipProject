package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.DepartmentRepository;
import com.example.service.DepartmentDeleteService;

@Service
public class DepartmentDeleteServiceImple
        implements DepartmentDeleteService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public void deleteById(int id) {

        repository.deleteById(id);
    }
}