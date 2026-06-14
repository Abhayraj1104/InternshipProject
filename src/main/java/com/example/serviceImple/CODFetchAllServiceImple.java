package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.COD;
import com.example.repository.CODRepository;
import com.example.service.CODFetchAllService;

@Service
public class CODFetchAllServiceImple implements CODFetchAllService {

    @Autowired
    private CODRepository repository;

    @Override
    public List<COD> fetchAll() {
        return repository.findAll();
    }
}
