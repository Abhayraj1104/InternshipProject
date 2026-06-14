package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.InvoiceRepository;
import com.example.service.InvoiceDeleteService;

@Service
public class InvoiceDeleteServiceImple implements InvoiceDeleteService {

    @Autowired
    private InvoiceRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
