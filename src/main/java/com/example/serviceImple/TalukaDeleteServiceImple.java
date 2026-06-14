package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.TalukaRepository;
import com.example.service.TalukaDeleteService;

@Service
public class TalukaDeleteServiceImple
        implements TalukaDeleteService {

    @Autowired
    private TalukaRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}