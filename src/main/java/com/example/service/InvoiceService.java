package com.example.service;

import java.util.List;


import com.example.entity.Invoice;

public interface InvoiceService {
	List<Invoice> fetchAll();
	Invoice fetchById(int id);
	void deleteById(int id);
	Invoice addData(Invoice invoice);
	Invoice updateData(Invoice invoice , int id);

}
