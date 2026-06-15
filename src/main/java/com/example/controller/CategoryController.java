package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Category;
import com.example.service.CategoryCreateService;
import com.example.service.CategoryDeleteService;
import com.example.service.CategoryFetchAllService;
import com.example.service.CategoryFetchService;
import com.example.service.CategoryUpdateService;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryCreateService categoryCreateService;

    @Autowired
    private CategoryDeleteService categoryDeleteService;

    @Autowired
    private CategoryUpdateService categoryUpdateService;

    @Autowired
    private CategoryFetchService categoryFetchService;

    @Autowired
    private CategoryFetchAllService categoryFetchAllService;

    @PostMapping("/save")
    public Category saveCategory(
            @RequestBody Category category) {

        return categoryCreateService.addData(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(
            @PathVariable Long id) {

        categoryDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Category> fetchAllCategory() {

        return categoryFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Category fetchCategory(
            @PathVariable Long id) {

        return categoryFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Category updateCategory(
            @RequestBody Category category,
            @PathVariable Long id) {

        return categoryUpdateService
                .updateData(category, id);
    }
}