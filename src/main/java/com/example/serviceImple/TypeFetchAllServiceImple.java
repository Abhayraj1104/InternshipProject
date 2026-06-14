package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Type;
import com.example.repository.TypeRepository;
import com.example.service.TypeFetchAllService;

@Service
public class TypeFetchAllServiceImple implements TypeFetchAllService {

    @Autowired
    private TypeRepository repository;

    @Override
    public List<Type> fetchAll() {
        return repository.findAll();
    }
}