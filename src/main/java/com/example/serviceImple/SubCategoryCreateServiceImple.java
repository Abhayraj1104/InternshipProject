package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.SubCategory;
import com.example.repository.SubCategoryRepository;
import com.example.service.SubCategoryCreateService;

@Service
public class SubCategoryCreateServiceImple implements SubCategoryCreateService {

    @Autowired
    private SubCategoryRepository repository;

    @Override
    public SubCategory addData(SubCategory subCategory) {
        return repository.save(subCategory);
    }
}
