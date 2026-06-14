package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryFetchService;

@Service
public class CategoryFetchServiceImple implements CategoryFetchService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public Category fetchById(Long id) {
        return repository.findById(id).get();
    }
}