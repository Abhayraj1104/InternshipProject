package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.entity.Upi;
import com.example.repository.OrderRepository;
import com.example.repository.UpiRepository;
import com.example.service.UpiUpdateService;

@Service
public class UpiUpdateServiceImple implements UpiUpdateService {

    @Autowired
    private UpiRepository upiRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Upi updateData(Upi upi, Long id) {
        Upi existingUpi = upiRepository.findById(id).orElse(null);
        if (existingUpi != null) {
            existingUpi.setUpiNumber(upi.getUpiNumber());

            if (upi.getOrder() != null && upi.getOrder().getOrderId() != null) {
                Order order = orderRepository.findById(upi.getOrder().getOrderId()).orElse(null);
                existingUpi.setOrder(order);
            }

            return upiRepository.save(existingUpi);
        }
        return null;
    }
}
