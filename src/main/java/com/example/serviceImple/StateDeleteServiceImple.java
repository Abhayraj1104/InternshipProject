package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.StateRepository;
import com.example.service.StateDeleteService;

@Service
public class StateDeleteServiceImple
        implements StateDeleteService {

    @Autowired
    private StateRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}