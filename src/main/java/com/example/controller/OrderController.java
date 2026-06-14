package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Order;
import com.example.service.OrderCreateService;
import com.example.service.OrderDeleteService;
import com.example.service.OrderFetchAllService;
import com.example.service.OrderFetchService;
import com.example.service.OrderUpdateService;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderCreateService orderCreateService;

    @Autowired
    private OrderDeleteService orderDeleteService;

    @Autowired
    private OrderUpdateService orderUpdateService;

    @Autowired
    private OrderFetchService orderFetchService;

    @Autowired
    private OrderFetchAllService orderFetchAllService;

    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order order) {
        return orderCreateService.addData(order);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Order> fetchAllOrder() {
        return orderFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Order fetchOrder(@PathVariable Long id) {
        return orderFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Order updateOrder(@RequestBody Order order,
                             @PathVariable Long id) {
        return orderUpdateService.updateData(order, id);
    }
}
