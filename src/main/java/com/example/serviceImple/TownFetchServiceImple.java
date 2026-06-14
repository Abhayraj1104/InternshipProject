package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Town;
import com.example.repository.TownRepository;
import com.example.service.TownFetchService;

@Service
public class TownFetchServiceImple
        implements TownFetchService {

    @Autowired
    private TownRepository repository;

    @Override
    public Town fetchById(Long id) {
        return repository.findById(id).orElse(null);
    }
}