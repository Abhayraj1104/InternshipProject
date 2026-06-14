package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.District;
import com.example.repository.DistrictRepository;
import com.example.service.DistrictFetchService;

@Service
public class DistrictFetchServiceImple
        implements DistrictFetchService {

    @Autowired
    private DistrictRepository repository;

    @Override
    public District fetchById(Long id) {
        return repository.findById(id).orElse(null);
    }
}