package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.District;
import com.example.repository.DistrictRepository;
import com.example.service.DistrictFetchAllService;

@Service
public class DistrictFetchAllServiceImple
        implements DistrictFetchAllService {

    @Autowired
    private DistrictRepository repository;

    @Override
    public List<District> fetchAll() {
        return repository.findAll();
    }
}