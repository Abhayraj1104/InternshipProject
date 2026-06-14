package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.UpiRepository;
import com.example.service.UpiDeleteService;

@Service
public class UpiDeleteServiceImple implements UpiDeleteService {

    @Autowired
    private UpiRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
