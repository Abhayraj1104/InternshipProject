package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Invoice;
import com.example.repository.InvoiceRepository;
import com.example.service.InvoiceFetchService;

@Service
public class InvoiceFetchServiceImple implements InvoiceFetchService {

    @Autowired
    private InvoiceRepository repository;

    @Override
    public Invoice fetchById(Long id) {
        return repository.findById(id).get();
    }
}
