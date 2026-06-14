package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.entity.Tracking;
import com.example.repository.OrderRepository;
import com.example.repository.TrackingRepository;
import com.example.service.TrackingUpdateService;

@Service
public class TrackingUpdateServiceImple implements TrackingUpdateService {

    @Autowired
    private TrackingRepository trackingRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Tracking updateData(Tracking tracking, Long id) {
        Tracking existingTracking = trackingRepository.findById(id).orElse(null);
        if (existingTracking != null) {
            existingTracking.setTrackingNumber(tracking.getTrackingNumber());
            existingTracking.setStatus(tracking.getStatus());

            if (tracking.getOrder() != null && tracking.getOrder().getOrderId() != null) {
                Order order = orderRepository.findById(tracking.getOrder().getOrderId()).orElse(null);
                existingTracking.setOrder(order);
            }

            return trackingRepository.save(existingTracking);
        }
        return null;
    }
}
