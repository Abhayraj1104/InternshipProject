package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.ShippingDetails;
import com.example.service.ShippingDetailsCreateService;
import com.example.service.ShippingDetailsDeleteService;
import com.example.service.ShippingDetailsFetchAllService;
import com.example.service.ShippingDetailsFetchService;
import com.example.service.ShippingDetailsUpdateService;

@RestController
@RequestMapping("/shippingDetails")
public class ShippingDetailsController {

    @Autowired
    private ShippingDetailsCreateService shippingDetailsCreateService;

    @Autowired
    private ShippingDetailsDeleteService shippingDetailsDeleteService;

    @Autowired
    private ShippingDetailsUpdateService shippingDetailsUpdateService;

    @Autowired
    private ShippingDetailsFetchService shippingDetailsFetchService;

    @Autowired
    private ShippingDetailsFetchAllService shippingDetailsFetchAllService;

    @PostMapping("/save")
    public ShippingDetails saveShippingDetails(@RequestBody ShippingDetails shippingDetails) {
        return shippingDetailsCreateService.addData(shippingDetails);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteShippingDetails(@PathVariable Long id) {
        shippingDetailsDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<ShippingDetails> fetchAllShippingDetails() {
        return shippingDetailsFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public ShippingDetails fetchShippingDetails(@PathVariable Long id) {
        return shippingDetailsFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public ShippingDetails updateShippingDetails(@RequestBody ShippingDetails shippingDetails,
                                                 @PathVariable Long id) {
        return shippingDetailsUpdateService.updateData(shippingDetails, id);
    }
}
