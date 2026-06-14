package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Invoice;
import com.example.repository.InvoiceRepository;
import com.example.service.InvoiceFetchAllService;

@Service
public class InvoiceFetchAllServiceImple implements InvoiceFetchAllService {

    @Autowired
    private InvoiceRepository repository;

    @Override
    public List<Invoice> fetchAll() {
        return repository.findAll();
    }
}
