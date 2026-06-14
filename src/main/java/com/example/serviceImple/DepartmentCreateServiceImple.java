package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Company;
import com.example.entity.Department;

import com.example.repository.CompanyRepository;
import com.example.repository.DepartmentRepository;

import com.example.service.DepartmentCreateService;

@Service
public class DepartmentCreateServiceImple
        implements DepartmentCreateService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Department addData(Department department) {

        Company company =
                companyRepository.findById(
                        department.getCompany()
                                  .getCompanyId())
                .orElse(null);

        department.setCompany(company);

        return departmentRepository.save(department);
    }
}