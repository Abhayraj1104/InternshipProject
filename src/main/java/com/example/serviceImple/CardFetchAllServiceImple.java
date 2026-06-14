package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Card;
import com.example.repository.CardRepository;
import com.example.service.CardFetchAllService;

@Service
public class CardFetchAllServiceImple implements CardFetchAllService {

    @Autowired
    private CardRepository repository;

    @Override
    public List<Card> fetchAll() {
        return repository.findAll();
    }
}
