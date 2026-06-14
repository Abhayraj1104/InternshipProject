package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.entity.Order;
import com.example.entity.ShippingDetails;
import com.example.repository.AddressRepository;
import com.example.repository.OrderRepository;
import com.example.repository.ShippingDetailsRepository;
import com.example.service.ShippingDetailsUpdateService;

@Service
public class ShippingDetailsUpdateServiceImple implements ShippingDetailsUpdateService {

    @Autowired
    private ShippingDetailsRepository shippingDetailsRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public ShippingDetails updateData(ShippingDetails shippingDetails, Long id) {
        ShippingDetails existingShipping = shippingDetailsRepository.findById(id).orElse(null);
        if (existingShipping != null) {
            existingShipping.setShippingDate(shippingDetails.getShippingDate());

            if (shippingDetails.getOrder() != null && shippingDetails.getOrder().getOrderId() != null) {
                Order order = orderRepository.findById(shippingDetails.getOrder().getOrderId()).orElse(null);
                existingShipping.setOrder(order);
            }

            if (shippingDetails.getAddress() != null) {
                Address address = addressRepository.findById(shippingDetails.getAddress().getId()).orElse(null);
                existingShipping.setAddress(address);
            }

            return shippingDetailsRepository.save(existingShipping);
        }
        return null;
    }
}
