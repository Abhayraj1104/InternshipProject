package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Upi;
import com.example.repository.UpiRepository;
import com.example.service.UpiCreateService;

@Service
public class UpiCreateServiceImple implements UpiCreateService {

    @Autowired
    private UpiRepository repository;

    @Override
    public Upi addData(Upi upi) {
        return repository.save(upi);
    }
}
