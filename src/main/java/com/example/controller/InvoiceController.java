package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Invoice;
import com.example.service.InvoiceCreateService;
import com.example.service.InvoiceDeleteService;
import com.example.service.InvoiceFetchAllService;
import com.example.service.InvoiceFetchService;
import com.example.service.InvoiceUpdateService;

@RestController
@RequestMapping("/invoice")
@CrossOrigin("*")
public class InvoiceController {

    @Autowired
    private InvoiceCreateService invoiceCreateService;

    @Autowired
    private InvoiceDeleteService invoiceDeleteService;

    @Autowired
    private InvoiceUpdateService invoiceUpdateService;

    @Autowired
    private InvoiceFetchService invoiceFetchService;

    @Autowired
    private InvoiceFetchAllService invoiceFetchAllService;

    @PostMapping("/save")
    public Invoice saveInvoice(@RequestBody Invoice invoice) {
        return invoiceCreateService.addData(invoice);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInvoice(@PathVariable Long id) {
        invoiceDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Invoice> fetchAllInvoice() {
        return invoiceFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Invoice fetchInvoice(@PathVariable Long id) {
        return invoiceFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Invoice updateInvoice(@RequestBody Invoice invoice,
                                 @PathVariable Long id) {
        return invoiceUpdateService.updateData(invoice, id);
    }
}
