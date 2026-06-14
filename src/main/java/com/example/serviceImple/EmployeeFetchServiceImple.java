package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeFetchService;

@Service
public class EmployeeFetchServiceImple implements EmployeeFetchService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee fetchById(int id) {

        return repository.findById(id)
                         .orElse(null);
    }
}