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

import com.example.entity.Brand;
import com.example.service.BrandCreateService;
import com.example.service.BrandDeleteService;
import com.example.service.BrandFetchAllService;
import com.example.service.BrandFetchService;
import com.example.service.BrandUpdateService;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandCreateService brandCreateService;

    @Autowired
    private BrandDeleteService brandDeleteService;

    @Autowired
    private BrandUpdateService brandUpdateService;

    @Autowired
    private BrandFetchService brandFetchService;

    @Autowired
    private BrandFetchAllService brandFetchAllService;

    @PostMapping("/save")
    public Brand saveBrand(@RequestBody Brand brand) {
        return brandCreateService.addData(brand);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBrand(@PathVariable Long id) {
        brandDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Brand> fetchAllBrand() {
        return brandFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Brand fetchBrand(@PathVariable Long id) {
        return brandFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Brand updateBrand(@RequestBody Brand brand,
                             @PathVariable Long id) {
        return brandUpdateService.updateData(brand, id);
    }
}
