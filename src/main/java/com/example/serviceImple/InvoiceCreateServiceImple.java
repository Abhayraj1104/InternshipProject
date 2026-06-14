package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Invoice;
import com.example.repository.InvoiceRepository;
import com.example.service.InvoiceCreateService;

@Service
public class InvoiceCreateServiceImple implements InvoiceCreateService {

    @Autowired
    private InvoiceRepository repository;

    @Override
    public Invoice addData(Invoice invoice) {
        return repository.save(invoice);
    }
}
