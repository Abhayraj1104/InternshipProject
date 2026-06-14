package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Upi;
import com.example.repository.UpiRepository;
import com.example.service.UpiFetchAllService;

@Service
public class UpiFetchAllServiceImple implements UpiFetchAllService {

    @Autowired
    private UpiRepository repository;

    @Override
    public List<Upi> fetchAll() {
        return repository.findAll();
    }
}
