package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Card;
import com.example.service.CardCreateService;
import com.example.service.CardDeleteService;
import com.example.service.CardFetchAllService;
import com.example.service.CardFetchService;
import com.example.service.CardUpdateService;

@RestController
@RequestMapping("/card")
@CrossOrigin("*")
public class CardController {

    @Autowired
    private CardCreateService cardCreateService;

    @Autowired
    private CardDeleteService cardDeleteService;

    @Autowired
    private CardUpdateService cardUpdateService;

    @Autowired
    private CardFetchService cardFetchService;

    @Autowired
    private CardFetchAllService cardFetchAllService;

    @PostMapping("/save")
    public Card saveCard(@RequestBody Card card) {
        return cardCreateService.addData(card);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCard(@PathVariable Long id) {
        cardDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Card> fetchAllCard() {
        return cardFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Card fetchCard(@PathVariable Long id) {
        return cardFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Card updateCard(@RequestBody Card card,
                           @PathVariable Long id) {
        return cardUpdateService.updateData(card, id);
    }
}
