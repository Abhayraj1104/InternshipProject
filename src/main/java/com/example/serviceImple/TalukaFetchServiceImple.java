package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Taluka;
import com.example.repository.TalukaRepository;
import com.example.service.TalukaFetchService;

@Service
public class TalukaFetchServiceImple
        implements TalukaFetchService {

    @Autowired
    private TalukaRepository repository;

    @Override
    public Taluka fetchById(Long id) {
        return repository.findById(id).orElse(null);
    }
}