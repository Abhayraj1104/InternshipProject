package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Upi;
import com.example.service.UpiCreateService;
import com.example.service.UpiDeleteService;
import com.example.service.UpiFetchAllService;
import com.example.service.UpiFetchService;
import com.example.service.UpiUpdateService;

@RestController
@RequestMapping("/upi")
public class UpiController {

    @Autowired
    private UpiCreateService upiCreateService;

    @Autowired
    private UpiDeleteService upiDeleteService;

    @Autowired
    private UpiUpdateService upiUpdateService;

    @Autowired
    private UpiFetchService upiFetchService;

    @Autowired
    private UpiFetchAllService upiFetchAllService;

    @PostMapping("/save")
    public Upi saveUpi(@RequestBody Upi upi) {
        return upiCreateService.addData(upi);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUpi(@PathVariable Long id) {
        upiDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Upi> fetchAllUpi() {
        return upiFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Upi fetchUpi(@PathVariable Long id) {
        return upiFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Upi updateUpi(@RequestBody Upi upi,
                         @PathVariable Long id) {
        return upiUpdateService.updateData(upi, id);
    }
}
