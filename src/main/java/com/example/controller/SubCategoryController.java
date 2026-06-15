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

import com.example.entity.SubCategory;
import com.example.service.SubCategoryCreateService;
import com.example.service.SubCategoryDeleteService;
import com.example.service.SubCategoryFetchAllService;
import com.example.service.SubCategoryFetchService;
import com.example.service.SubCategoryUpdateService;

@RestController
@RequestMapping("/subCategory")
@CrossOrigin("*")
public class SubCategoryController {

    @Autowired
    private SubCategoryCreateService subCategoryCreateService;

    @Autowired
    private SubCategoryDeleteService subCategoryDeleteService;

    @Autowired
    private SubCategoryUpdateService subCategoryUpdateService;

    @Autowired
    private SubCategoryFetchService subCategoryFetchService;

    @Autowired
    private SubCategoryFetchAllService subCategoryFetchAllService;

    @PostMapping("/save")
    public SubCategory saveSubCategory(@RequestBody SubCategory subCategory) {
        return subCategoryCreateService.addData(subCategory);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubCategory(@PathVariable Long id) {
        subCategoryDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<SubCategory> fetchAllSubCategory() {
        return subCategoryFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public SubCategory fetchSubCategory(@PathVariable Long id) {
        return subCategoryFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public SubCategory updateSubCategory(@RequestBody SubCategory subCategory,
                                         @PathVariable Long id) {
        return subCategoryUpdateService.updateData(subCategory, id);
    }
}
