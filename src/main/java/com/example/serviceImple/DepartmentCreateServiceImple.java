package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.example.entity.Company;
import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.entity.Manager;

import com.example.repository.AdminRepository;
import com.example.repository.CompanyRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.ManagerRepository;

import com.example.service.DepartmentCreateService;

@Service
public class DepartmentCreateServiceImple
        implements DepartmentCreateService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Department addData(Department department) {

        Manager manager =
                managerRepository.findById(
                        department.getManager().getId())
                .orElse(null);

        Admin admin =
                adminRepository.findById(
                        department.getAdmin().getId())
                .orElse(null);

        Company company =
                companyRepository.findById(
                        department.getCompany().getRegNo())
                .orElse(null);

        List<Employee> employees =
                employeeRepository.findAllById(
                        department.getEmployees()
                                .stream()
                                .map(Employee::getId)
                                .toList());

        department.setManager(manager);
        department.setAdmin(admin);
        department.setCompany(company);
        department.setEmployees(employees);

        return departmentRepository.save(department);
    }
}