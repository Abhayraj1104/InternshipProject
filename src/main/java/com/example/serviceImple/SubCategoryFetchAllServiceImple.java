package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.SubCategory;
import com.example.repository.SubCategoryRepository;
import com.example.service.SubCategoryFetchAllService;

@Service
public class SubCategoryFetchAllServiceImple implements SubCategoryFetchAllService {

    @Autowired
    private SubCategoryRepository repository;

    @Override
    public List<SubCategory> fetchAll() {
        return repository.findAll();
    }
}
