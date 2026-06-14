package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Card;
import com.example.repository.CardRepository;
import com.example.service.CardFetchService;

@Service
public class CardFetchServiceImple implements CardFetchService {

    @Autowired
    private CardRepository repository;

    @Override
    public Card fetchById(Long id) {
        return repository.findById(id).get();
    }
}
