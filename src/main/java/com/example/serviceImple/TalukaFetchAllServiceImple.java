package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Taluka;
import com.example.repository.TalukaRepository;
import com.example.service.TalukaFetchAllService;

@Service
public class TalukaFetchAllServiceImple
        implements TalukaFetchAllService {

    @Autowired
    private TalukaRepository repository;

    @Override
    public List<Taluka> fetchAll() {
        return repository.findAll();
    }
}