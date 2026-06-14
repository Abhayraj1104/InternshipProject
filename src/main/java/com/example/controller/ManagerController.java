package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Manager;

import com.example.service.ManagerCreateService;
import com.example.service.ManagerDeleteService;
import com.example.service.ManagerFetchAllService;
import com.example.service.ManagerFetchService;
import com.example.service.ManagerUpdateService;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ManagerCreateService managerCreateService;

    @Autowired
    private ManagerUpdateService managerUpdateService;

    @Autowired
    private ManagerDeleteService managerDeleteService;

    @Autowired
    private ManagerFetchService managerFetchService;

    @Autowired
    private ManagerFetchAllService managerFetchAllService;

    @PostMapping("/save")
    public Manager saveManager(
            @RequestBody Manager manager) {

        return managerCreateService.addData(manager);
    }

    @PutMapping("/update/{id}")
    public Manager updateManager(
            @RequestBody Manager manager,
            @PathVariable Integer id) {

        return managerUpdateService.updateData(manager, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteManager(
            @PathVariable Integer id) {

        managerDeleteService.deleteById(id);
    }

    @GetMapping("/fetch/{id}")
    public Manager fetchManager(
            @PathVariable Integer id) {

        return managerFetchService.fetchById(id);
    }

    @GetMapping("/fetchAll")
    public List<Manager> fetchAllManagers() {

        return managerFetchAllService.fetchAll();
    }
}