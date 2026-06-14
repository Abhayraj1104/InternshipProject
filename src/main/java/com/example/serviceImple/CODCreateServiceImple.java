package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.COD;
import com.example.repository.CODRepository;
import com.example.service.CODCreateService;

@Service
public class CODCreateServiceImple implements CODCreateService {

    @Autowired
    private CODRepository repository;

    @Override
    public COD addData(COD cod) {
        return repository.save(cod);
    }
}
