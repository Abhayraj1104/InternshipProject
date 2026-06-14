package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.COD;
import com.example.repository.CODRepository;
import com.example.service.CODFetchService;

@Service
public class CODFetchServiceImple implements CODFetchService {

    @Autowired
    private CODRepository repository;

    @Override
    public COD fetchById(Long id) {
        return repository.findById(id).get();
    }
}
