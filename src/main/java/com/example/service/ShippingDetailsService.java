package com.example.service;

import java.util.List;


import com.example.entity.ShippingDetails;

public interface ShippingDetailsService {
	List<ShippingDetails> fetchAll();
	ShippingDetails fetchById(int id);
	void deleteById(int id);
	ShippingDetails addData(ShippingDetails shippingDetails);
	ShippingDetails updateData(ShippingDetails shippingDetails , int id);

}
