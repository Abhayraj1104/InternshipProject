package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.State;
import com.example.repository.StateRepository;
import com.example.service.StateFetchService;

@Service
public class StateFetchServiceImple
        implements StateFetchService {

    @Autowired
    private StateRepository repository;

    @Override
    public State fetchById(Long id) {
        return repository.findById(id).orElse(null);
    }
}