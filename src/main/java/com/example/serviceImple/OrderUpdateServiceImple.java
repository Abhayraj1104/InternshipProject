package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.entity.PaymentMode;
import com.example.entity.User;
import com.example.repository.OrderRepository;
import com.example.repository.PaymentModeRepository;
import com.example.repository.UserRepository;
import com.example.service.OrderUpdateService;

@Service
public class OrderUpdateServiceImple implements OrderUpdateService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PaymentModeRepository paymentModeRepository;

    @Override
    public Order updateData(Order order, Long id) {
        Order existingOrder = orderRepository.findById(id).orElse(null);
        if (existingOrder != null) {
            existingOrder.setOrderDate(order.getOrderDate());
            existingOrder.setTotalAmount(order.getTotalAmount());

            if (order.getUser() != null) {
                User user = userRepository.findById(order.getUser().getId()).orElse(null);
                existingOrder.setUser(user);
            }

            if (order.getPaymentMode() != null && order.getPaymentMode().getPaymentModeId() != null) {
                PaymentMode paymentMode = paymentModeRepository.findById(order.getPaymentMode().getPaymentModeId()).orElse(null);
                existingOrder.setPaymentMode(paymentMode);
            }

            return orderRepository.save(existingOrder);
        }
        return null;
    }
}
