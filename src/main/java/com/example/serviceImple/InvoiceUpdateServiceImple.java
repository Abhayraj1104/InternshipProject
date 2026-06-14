package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Invoice;
import com.example.entity.Order;
import com.example.repository.InvoiceRepository;
import com.example.repository.OrderRepository;
import com.example.service.InvoiceUpdateService;

@Service
public class InvoiceUpdateServiceImple implements InvoiceUpdateService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Invoice updateData(Invoice invoice, Long id) {
        Invoice existingInvoice = invoiceRepository.findById(id).orElse(null);
        if (existingInvoice != null) {
            existingInvoice.setInvoiceDate(invoice.getInvoiceDate());
            existingInvoice.setAmount(invoice.getAmount());

            if (invoice.getOrder() != null && invoice.getOrder().getOrderId() != null) {
                Order order = orderRepository.findById(invoice.getOrder().getOrderId()).orElse(null);
                existingInvoice.setOrder(order);
            }

            return invoiceRepository.save(existingInvoice);
        }
        return null;
    }
}
