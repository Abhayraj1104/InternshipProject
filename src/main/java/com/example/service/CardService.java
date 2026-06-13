package com.example.service;

import java.util.List;


import com.example.entity.Card;

public interface CardService {
	List<Card> fetchAll();
	Card fetchById(int id);
	void deleteById(int id);
	Card addData(Card card);
	Card updateData(Card card , int id);

}
