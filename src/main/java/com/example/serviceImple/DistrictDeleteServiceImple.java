package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.DistrictRepository;
import com.example.service.DistrictDeleteService;

@Service
public class DistrictDeleteServiceImple
        implements DistrictDeleteService {

    @Autowired
    private DistrictRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}