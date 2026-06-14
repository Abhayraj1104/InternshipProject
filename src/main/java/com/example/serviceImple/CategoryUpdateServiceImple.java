package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Category;
import com.example.repository.CategoryRepository;
import com.example.service.CategoryUpdateService;

@Service
public class CategoryUpdateServiceImple implements CategoryUpdateService {

    @Autowired
    private CategoryRepository repository;

    @Override
    public Category updateData(Category category,
                               Long id) {

        Category existingCategory =
                repository.findById(id).orElse(null);

        if(existingCategory != null) {

            existingCategory.setCategoryName(
                    category.getCategoryName());

            return repository.save(existingCategory);
        }

        return null;
    }
}