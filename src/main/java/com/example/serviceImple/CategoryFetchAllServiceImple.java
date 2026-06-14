package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryFetchAllService;

@Service
public class CategoryFetchAllServiceImple
        implements CategoryFetchAllService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public List<Category> fetchAll() {
        return repository.findAll();
    }
}