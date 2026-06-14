package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.TownRepository;
import com.example.service.TownDeleteService;

@Service
public class TownDeleteServiceImple
        implements TownDeleteService {

    @Autowired
    private TownRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}