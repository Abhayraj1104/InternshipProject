package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Upi;
import com.example.repository.UpiRepository;
import com.example.service.UpiFetchService;

@Service
public class UpiFetchServiceImple implements UpiFetchService {

    @Autowired
    private UpiRepository repository;

    @Override
    public Upi fetchById(Long id) {
        return repository.findById(id).get();
    }
}
