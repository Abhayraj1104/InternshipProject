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

import com.example.entity.Admin;
import com.example.service.AdminCreateService;
import com.example.service.AdminDeleteService;
import com.example.service.AdminFetchAllService;
import com.example.service.AdminFetchService;
import com.example.service.AdminUpdateService;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private AdminCreateService adminCreateService;

    @Autowired
    private AdminDeleteService adminDeleteService;

    @Autowired
    private AdminUpdateService adminUpdateService;

    @Autowired
    private AdminFetchService adminFetchService;

    @Autowired
    private AdminFetchAllService adminFetchAllService;

    @PostMapping("/save")
    public Admin saveAdmin(@RequestBody Admin admin) {

        return adminCreateService.addData(admin);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAdmin(@PathVariable int id) {

        adminDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Admin> fetchAllAdmin() {

        return adminFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Admin fetchAdmin(@PathVariable int id) {

        return adminFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Admin updateAdmin(@RequestBody Admin admin,
                             @PathVariable int id) {

        return adminUpdateService.updateData(admin, id);
    }
}