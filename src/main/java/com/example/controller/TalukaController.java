package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Taluka;
import com.example.service.TalukaCreateService;
import com.example.service.TalukaDeleteService;
import com.example.service.TalukaFetchAllService;
import com.example.service.TalukaFetchService;
import com.example.service.TalukaUpdateService;

@RestController
@RequestMapping("/taluka")
public class TalukaController {

    @Autowired
    private TalukaCreateService talukaCreateService;

    @Autowired
    private TalukaDeleteService talukaDeleteService;

    @Autowired
    private TalukaUpdateService talukaUpdateService;

    @Autowired
    private TalukaFetchService talukaFetchService;

    @Autowired
    private TalukaFetchAllService talukaFetchAllService;

    @PostMapping("/save")
    public Taluka saveTaluka(
            @RequestBody Taluka taluka) {

        return talukaCreateService.addData(taluka);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTaluka(
            @PathVariable Long id) {

        talukaDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Taluka> fetchAllTaluka() {

        return talukaFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Taluka fetchTaluka(
            @PathVariable Long id) {

        return talukaFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Taluka updateTaluka(
            @RequestBody Taluka taluka,
            @PathVariable Long id) {

        return talukaUpdateService
                .updateData(taluka, id);
    }
}