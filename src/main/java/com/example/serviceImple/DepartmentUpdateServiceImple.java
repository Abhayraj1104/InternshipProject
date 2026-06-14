package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Company;
import com.example.entity.Department;

import com.example.repository.CompanyRepository;
import com.example.repository.DepartmentRepository;

import com.example.service.DepartmentUpdateService;

@Service
public class DepartmentUpdateServiceImple
        implements DepartmentUpdateService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Department updateData(Department department,
                                 Long id) {

        Department existingDepartment =
                departmentRepository.findById(id)
                                    .orElse(null);

        if(existingDepartment != null) {

            existingDepartment.setDeptName(
                    department.getDeptName());

            Company company =
                    companyRepository.findById(
                            department.getCompany()
                                      .getCompanyId())
                    .orElse(null);

            existingDepartment.setCompany(company);

            return departmentRepository
                    .save(existingDepartment);
        }

        return null;
    }
}