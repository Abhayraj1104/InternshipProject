package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.Employee;

import com.example.service.EmployeeCreateService;
import com.example.service.EmployeeDeleteService;
import com.example.service.EmployeeFetchAllService;
import com.example.service.EmployeeFetchService;
import com.example.service.EmployeeUpdateService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeCreateService employeeCreateService;

    @Autowired
    private EmployeeUpdateService employeeUpdateService;

    @Autowired
    private EmployeeDeleteService employeeDeleteService;

    @Autowired
    private EmployeeFetchService employeeFetchService;

    @Autowired
    private EmployeeFetchAllService employeeFetchAllService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {

        return employeeCreateService.addData(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(
            @RequestBody Employee employee,
            @PathVariable Integer id) {

        return employeeUpdateService.updateData(employee, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Integer id) {

        employeeDeleteService.deleteById(id);
    }

    @GetMapping("/fetch/{id}")
    public Employee fetchEmployee(@PathVariable Integer id) {

        return employeeFetchService.fetchById(id);
    }

    @GetMapping("/fetchAll")
    public List<Employee> fetchAllEmployees() {

        return employeeFetchAllService.fetchAll();
    }
}