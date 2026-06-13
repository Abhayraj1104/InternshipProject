package com.example.service;

import java.util.List;


import com.example.entity.PaymentMode;

public interface PaymentModeService {
	List<PaymentMode> fetchAll();
	PaymentMode fetchById(int id);
	void deleteById(int id);
	PaymentMode addData(PaymentMode paymentMode);
	PaymentMode updateData(PaymentMode paymentMode , int id);

}
