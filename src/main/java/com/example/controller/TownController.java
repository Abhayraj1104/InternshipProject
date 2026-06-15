package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Town;
import com.example.service.TownCreateService;
import com.example.service.TownDeleteService;
import com.example.service.TownFetchAllService;
import com.example.service.TownFetchService;
import com.example.service.TownUpdateService;

@RestController
@RequestMapping("/town")
@CrossOrigin("*")
public class TownController {

    @Autowired
    private TownCreateService townCreateService;

    @Autowired
    private TownDeleteService townDeleteService;

    @Autowired
    private TownUpdateService townUpdateService;

    @Autowired
    private TownFetchService townFetchService;

    @Autowired
    private TownFetchAllService townFetchAllService;

    @PostMapping("/save")
    public Town saveTown(@RequestBody Town town) {
        return townCreateService.addData(town);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTown(@PathVariable Long id) {
        townDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Town> fetchAllTown() {
        return townFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Town fetchTown(@PathVariable Long id) {
        return townFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Town updateTown(@RequestBody Town town,
                           @PathVariable Long id) {

        return townUpdateService.updateData(town, id);
    }
}