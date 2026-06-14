package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Town;
import com.example.repository.TownRepository;
import com.example.service.TownFetchAllService;

@Service
public class TownFetchAllServiceImple
        implements TownFetchAllService {

    @Autowired
    private TownRepository repository;

    @Override
    public List<Town> fetchAll() {
        return repository.findAll();
    }
}