package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryCreateService;

@Service
public class CategoryCreateServiceImple
        implements CategoryCreateService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public Category addData(Category category) {
        return repository.save(category);
    }
}