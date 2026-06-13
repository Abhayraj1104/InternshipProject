package com.example.service;

import java.util.List;


import com.example.entity.Order;

public interface OrderService {
	List<Order> fetchAll();
	Order fetchById(int id);
	void deleteById(int id);
	Order addData(Order order);
	Order updateData(Order order , int id);

}
