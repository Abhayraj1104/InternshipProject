package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.State;
import com.example.repository.StateRepository;
import com.example.service.StateFetchAllService;

@Service
public class StateFetchAllServiceImple
        implements StateFetchAllService {

    @Autowired
    private StateRepository repository;

    @Override
    public List<State> fetchAll() {
        return repository.findAll();
    }
}