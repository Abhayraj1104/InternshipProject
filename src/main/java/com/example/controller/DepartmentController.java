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

import com.example.entity.Department;
import com.example.service.DepartmentCreateService;
import com.example.service.DepartmentDeleteService;
import com.example.service.DepartmentFetchAllService;
import com.example.service.DepartmentFetchService;
import com.example.service.DepartmentUpdateService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentCreateService departmentCreateService;

    @Autowired
    private DepartmentDeleteService departmentDeleteService;

    @Autowired
    private DepartmentUpdateService departmentUpdateService;

    @Autowired
    private DepartmentFetchService departmentFetchService;

    @Autowired
    private DepartmentFetchAllService departmentFetchAllService;

    @PostMapping("/save")
    public Department saveDepartment(
            @RequestBody Department department) {

        return departmentCreateService.addData(department);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(
            @PathVariable int id) {

        departmentDeleteService.deleteById(id);
    }

    @GetMapping("/fetchAll")
    public List<Department> fetchAllDepartment() {

        return departmentFetchAllService.fetchAll();
    }

    @GetMapping("/fetch/{id}")
    public Department fetchDepartment(
            @PathVariable int id) {

        return departmentFetchService.fetchById(id);
    }

    @PutMapping("/update/{id}")
    public Department updateDepartment(
            @RequestBody Department department,
            @PathVariable int id) {

        return departmentUpdateService
                .updateData(department, id);
    }
}