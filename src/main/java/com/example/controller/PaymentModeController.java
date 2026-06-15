package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.PaymentMode;
import com.example.service.PaymentModeCreateService;
import com.example.service.PaymentModeDeleteService;
import com.example.service.PaymentModeFetchAllService;
import com.example.service.PaymentModeFetchService;
import com.example.service.PaymentModeUpdateService;

@RestController
@RequestMapping("/paymentMode")
@CrossOrigin("*")
public class PaymentModeController {

    @Autowired
    private PaymentModeCreateService paymentModeCreateService;

    @Autowired
    private PaymentModeDeleteService paymentModeDeleteService;

    @Autowired
    private PaymentModeUpdateService paymentModeUpdateService;

    @Autowired
    private PaymentModeFetchService paymentModeFetchService;

    @Autowired
    private PaymentModeFetchAllService paymentModeFetchAllService;

    @PostMapping("/save")
    public PaymentMode savePaymentMode(
            @RequestBody PaymentMode paymentMode) {

        return paymentModeCreateService.addData(paymentMode);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePaymentMode(
            @PathVariable Integer id) {

        paymentModeDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<PaymentMode> fetchAllPaymentMode() {

        return paymentModeFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public PaymentMode fetchPaymentMode(
            @PathVariable Integer id) {

        return paymentModeFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public PaymentMode updatePaymentMode(
            @RequestBody PaymentMode paymentMode,
            @PathVariable Integer id) {

        return paymentModeUpdateService
                .updateData(paymentMode, id);
    }
}