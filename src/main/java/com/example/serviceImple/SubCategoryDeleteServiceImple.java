package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.SubCategoryRepository;
import com.example.service.SubCategoryDeleteService;

@Service
public class SubCategoryDeleteServiceImple implements SubCategoryDeleteService {

    @Autowired
    private SubCategoryRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
