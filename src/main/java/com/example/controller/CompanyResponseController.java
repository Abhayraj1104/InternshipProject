package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.CompanyResponse;
import com.example.service.CompanyResponseCreateService;
import com.example.service.CompanyResponseDeleteService;
import com.example.service.CompanyResponseFetchAllService;
import com.example.service.CompanyResponseFetchService;
import com.example.service.CompanyResponseUpdateService;

@RestController
@RequestMapping("/companyResponse")
@CrossOrigin("*")
public class CompanyResponseController {

    @Autowired
    private CompanyResponseCreateService companyResponseCreateService;

    @Autowired
    private CompanyResponseDeleteService companyResponseDeleteService;

    @Autowired
    private CompanyResponseUpdateService companyResponseUpdateService;

    @Autowired
    private CompanyResponseFetchService companyResponseFetchService;

    @Autowired
    private CompanyResponseFetchAllService companyResponseFetchAllService;

    @PostMapping("/save")
    public CompanyResponse saveCompanyResponse(@RequestBody CompanyResponse companyResponse) {
        return companyResponseCreateService.addData(companyResponse);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompanyResponse(@PathVariable Long id) {
        companyResponseDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<CompanyResponse> fetchAllCompanyResponse() {
        return companyResponseFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public CompanyResponse fetchCompanyResponse(@PathVariable Long id) {
        return companyResponseFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public CompanyResponse updateCompanyResponse(@RequestBody CompanyResponse companyResponse,
                                                 @PathVariable Long id) {
        return companyResponseUpdateService.updateData(companyResponse, id);
    }
}
