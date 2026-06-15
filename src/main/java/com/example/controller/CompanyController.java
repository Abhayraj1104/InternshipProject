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

import com.example.entity.Company;
import com.example.service.CompanyCreateService;
import com.example.service.CompanyDeleteService;
import com.example.service.CompanyFetchAllService;
import com.example.service.CompanyFetchService;
import com.example.service.CompanyUpdateService;

@RestController
@RequestMapping("/company")
@CrossOrigin("*")
public class CompanyController {

    @Autowired
    private CompanyCreateService companyCreateService;

    @Autowired
    private CompanyDeleteService companyDeleteService;

    @Autowired
    private CompanyUpdateService companyUpdateService;

    @Autowired
    private CompanyFetchService companyFetchService;

    @Autowired
    private CompanyFetchAllService companyFetchAllService;

    @PostMapping("/save")
    public Company saveCompany(@RequestBody Company company) {

        return companyCreateService.addData(company);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable int id) {

        companyDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Company> fetchAllCompany() {

        return companyFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Company fetchCompany(@PathVariable int id) {

        return companyFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Company updateCompany(@RequestBody Company company,
                                 @PathVariable int id) {

        return companyUpdateService.updateData(company, id);
    }
}