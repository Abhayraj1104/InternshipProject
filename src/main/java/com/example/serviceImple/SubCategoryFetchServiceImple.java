package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.SubCategory;
import com.example.repository.SubCategoryRepository;
import com.example.service.SubCategoryFetchService;

@Service
public class SubCategoryFetchServiceImple implements SubCategoryFetchService {

    @Autowired
    private SubCategoryRepository repository;

    @Override
    public SubCategory fetchById(Long id) {
        return repository.findById(id).get();
    }
}
