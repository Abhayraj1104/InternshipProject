package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeFetchAllService;

@Service
public class EmployeeFetchAllServiceImple implements EmployeeFetchAllService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> fetchAll() {

        return repository.findAll();
    }
}