package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.District;
import com.example.service.DistrictCreateService;
import com.example.service.DistrictDeleteService;
import com.example.service.DistrictFetchAllService;
import com.example.service.DistrictFetchService;
import com.example.service.DistrictUpdateService;

@RestController
@RequestMapping("/district")
@CrossOrigin("*")
public class DistrictController {

    @Autowired
    private DistrictCreateService districtCreateService;

    @Autowired
    private DistrictDeleteService districtDeleteService;

    @Autowired
    private DistrictUpdateService districtUpdateService;

    @Autowired
    private DistrictFetchService districtFetchService;

    @Autowired
    private DistrictFetchAllService districtFetchAllService;

    @PostMapping("/save")
    public District saveDistrict(
            @RequestBody District district) {

        return districtCreateService.addData(district);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDistrict(
            @PathVariable Long id) {

        districtDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<District> fetchAllDistrict() {

        return districtFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public District fetchDistrict(
            @PathVariable Long id) {

        return districtFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public District updateDistrict(
            @RequestBody District district,
            @PathVariable Long id) {

        return districtUpdateService
                .updateData(district, id);
    }
}