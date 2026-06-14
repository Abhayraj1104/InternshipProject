package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.CustomerQuery;
import com.example.service.CustomerQueryCreateService;
import com.example.service.CustomerQueryDeleteService;
import com.example.service.CustomerQueryFetchAllService;
import com.example.service.CustomerQueryFetchService;
import com.example.service.CustomerQueryUpdateService;

@RestController
@RequestMapping("/customerQuery")
public class CustomerQueryController {

    @Autowired
    private CustomerQueryCreateService customerQueryCreateService;

    @Autowired
    private CustomerQueryDeleteService customerQueryDeleteService;

    @Autowired
    private CustomerQueryUpdateService customerQueryUpdateService;

    @Autowired
    private CustomerQueryFetchService customerQueryFetchService;

    @Autowired
    private CustomerQueryFetchAllService customerQueryFetchAllService;

    @PostMapping("/save")
    public CustomerQuery saveCustomerQuery(@RequestBody CustomerQuery customerQuery) {
        return customerQueryCreateService.addData(customerQuery);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomerQuery(@PathVariable Long id) {
        customerQueryDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<CustomerQuery> fetchAllCustomerQuery() {
        return customerQueryFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public CustomerQuery fetchCustomerQuery(@PathVariable Long id) {
        return customerQueryFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public CustomerQuery updateCustomerQuery(@RequestBody CustomerQuery customerQuery,
                                             @PathVariable Long id) {
        return customerQueryUpdateService.updateData(customerQuery, id);
    }
}
