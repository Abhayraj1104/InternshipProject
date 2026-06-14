package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
import com.example.service.DepartmentFetchService;

@Service
public class DepartmentFetchServiceImple
        implements DepartmentFetchService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public Department fetchById(Long id) {

        return repository.findById(id)
                         .orElse(null);
    }
}