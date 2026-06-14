package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CardRepository;
import com.example.service.CardDeleteService;

@Service
public class CardDeleteServiceImple implements CardDeleteService {

    @Autowired
    private CardRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
