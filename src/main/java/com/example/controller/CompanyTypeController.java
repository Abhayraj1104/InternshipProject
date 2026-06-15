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

import com.example.entity.CompanyType;
import com.example.service.TypeCreateService;
import com.example.service.TypeDeleteService;
import com.example.service.TypeFetchAllService;
import com.example.service.TypeFetchService;
import com.example.service.TypeUpdateService;

@RestController
@RequestMapping("/type")
public class CompanyTypeController {

    @Autowired
    private TypeCreateService typeCreateService;

    @Autowired
    private TypeDeleteService typeDeleteService;

    @Autowired
    private TypeUpdateService typeUpdateService;

    @Autowired
    private TypeFetchService typeFetchService;

    @Autowired
    private TypeFetchAllService typeFetchAllService;

    @PostMapping("/save")
    public CompanyType saveType(@RequestBody CompanyType type) {
        return typeCreateService.addData(type);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteType(@PathVariable int id) {
        typeDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<CompanyType> fetchAllType() {
        return typeFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public CompanyType fetchType(@PathVariable int id) {
        return typeFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public CompanyType updateType(@RequestBody CompanyType type,
                           @PathVariable int id) {
        return typeUpdateService.updateData(type, id);
    }
}