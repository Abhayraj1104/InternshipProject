package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.repository.DepartmentRepository;
import com.example.service.DepartmentFetchAllService;

@Service
public class DepartmentFetchAllServiceImple
        implements DepartmentFetchAllService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public List<Department> fetchAll() {

        return repository.findAll();
    }
}