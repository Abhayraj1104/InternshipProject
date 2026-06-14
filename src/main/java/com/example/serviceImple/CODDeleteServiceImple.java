package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CODRepository;
import com.example.service.CODDeleteService;

@Service
public class CODDeleteServiceImple implements CODDeleteService {

    @Autowired
    private CODRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
