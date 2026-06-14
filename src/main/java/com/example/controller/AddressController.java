package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Address;
import com.example.service.AddressCreateService;
import com.example.service.AddressDeleteService;
import com.example.service.AddressFetchAllService;
import com.example.service.AddressFetchService;
import com.example.service.AddressUpdateService;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressCreateService addressCreateService;

    @Autowired
    private AddressDeleteService addressDeleteService;

    @Autowired
    private AddressUpdateService addressUpdateService;

    @Autowired
    private AddressFetchService addressFetchService;

    @Autowired
    private AddressFetchAllService addressFetchAllService;

    @PostMapping("/save")
    public Address saveAddress(@RequestBody Address address) {

        return addressCreateService.addData(address);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAddress(@PathVariable int id) {

        addressDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Address> fetchAllAddress() {

        return addressFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Address fetchAddress(@PathVariable int id) {

        return addressFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Address updateAddress(@RequestBody Address address,
                                 @PathVariable int id) {

        return addressUpdateService.updateData(address, id);
    }
}