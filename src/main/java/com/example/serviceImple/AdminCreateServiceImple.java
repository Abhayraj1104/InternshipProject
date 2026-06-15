package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.entity.Admin;
import com.example.entity.Company;
import com.example.entity.Department;
import com.example.entity.Role;

import com.example.repository.AddressRepository;
import com.example.repository.AdminRepository;
import com.example.repository.CompanyRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.RoleRepository;

import com.example.service.AdminCreateService;

@Service
public class AdminCreateServiceImple
        implements AdminCreateService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Admin addData(Admin admin) {

        List<Address> addresses =
                addressRepository.findAllById(
                        admin.getAddresses()
                             .stream()
                             .map(Address::getId)
                             .toList());

        Company company =
                companyRepository.findById(
                        admin.getCompany()
                             .getRegNo())
                .orElse(null);

        Department department =
                departmentRepository.findById(
                        admin.getDepartment()
                             .getDid())
                .orElse(null);

        Role role =
                roleRepository.findById(
                        admin.getRole()
                             .getRoleId())
                .orElse(null);

        admin.setAddresses(addresses);
        admin.setCompany(company);
        admin.setDepartment(department);
        admin.setRole(role);

        return adminRepository.save(admin);
    }
}