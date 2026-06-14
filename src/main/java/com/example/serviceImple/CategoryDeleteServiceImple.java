package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CategoryRepository;
import com.example.service.CategoryDeleteService;

@Service
public class CategoryDeleteServiceImple
        implements CategoryDeleteService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}