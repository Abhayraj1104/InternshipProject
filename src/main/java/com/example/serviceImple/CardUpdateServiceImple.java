package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Card;
import com.example.entity.Order;
import com.example.repository.CardRepository;
import com.example.repository.OrderRepository;
import com.example.service.CardUpdateService;

@Service
public class CardUpdateServiceImple implements CardUpdateService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Card updateData(Card card, Long id) {
        Card existingCard = cardRepository.findById(id).orElse(null);
        if (existingCard != null) {
            existingCard.setCardNumber(card.getCardNumber());
            existingCard.setHolderName(card.getHolderName());

            if (card.getOrder() != null && card.getOrder().getOrderId() != null) {
                Order order = orderRepository.findById(card.getOrder().getOrderId()).orElse(null);
                existingCard.setOrder(order);
            }

            return cardRepository.save(existingCard);
        }
        return null;
    }
}
