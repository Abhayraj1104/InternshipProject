package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.COD;
import com.example.entity.Order;
import com.example.repository.CODRepository;
import com.example.repository.OrderRepository;
import com.example.service.CODUpdateService;

@Service
public class CODUpdateServiceImple implements CODUpdateService {

    @Autowired
    private CODRepository codRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public COD updateData(COD cod, Long id) {
        COD existingCOD = codRepository.findById(id).orElse(null);
        if (existingCOD != null) {
            existingCOD.setStatus(cod.getStatus());

            if (cod.getOrder() != null && cod.getOrder().getOrderId() != null) {
                Order order = orderRepository.findById(cod.getOrder().getOrderId()).orElse(null);
                existingCOD.setOrder(order);
            }

            return codRepository.save(existingCOD);
        }
        return null;
    }
}
