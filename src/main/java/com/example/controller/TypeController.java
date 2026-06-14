package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Type;
import com.example.service.TypeCreateService;
import com.example.service.TypeDeleteService;
import com.example.service.TypeFetchAllService;
import com.example.service.TypeFetchService;
import com.example.service.TypeUpdateService;

@RestController
@RequestMapping("/type")
public class TypeController {

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
    public Type saveType(@RequestBody Type type) {
        return typeCreateService.addData(type);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteType(@PathVariable int id) {
        typeDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Type> fetchAllType() {
        return typeFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Type fetchType(@PathVariable int id) {
        return typeFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Type updateType(@RequestBody Type type,
                           @PathVariable int id) {
        return typeUpdateService.updateData(type, id);
    }
}