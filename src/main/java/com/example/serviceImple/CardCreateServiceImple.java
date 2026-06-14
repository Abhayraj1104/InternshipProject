package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Card;
import com.example.repository.CardRepository;
import com.example.service.CardCreateService;

@Service
public class CardCreateServiceImple implements CardCreateService {

    @Autowired
    private CardRepository repository;

    @Override
    public Card addData(Card card) {
        return repository.save(card);
    }
}
