package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Admin;
import com.example.entity.Address;
import com.example.entity.Company;
import com.example.entity.Department;
import com.example.entity.Role;

import com.example.repository.AdminRepository;
import com.example.repository.AddressRepository;
import com.example.repository.CompanyRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.RoleRepository;

import com.example.service.AdminUpdateService;

@Service
public class AdminUpdateServiceImple
        implements AdminUpdateService {

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
    public Admin updateData(Admin admin, int id) {

        Admin existingAdmin =
                adminRepository.findById(id)
                               .orElse(null);

        if (existingAdmin != null) {

            existingAdmin.setName(admin.getName());
            existingAdmin.setAdhar(admin.getAdhar());
            existingAdmin.setPanno(admin.getPanno());
            existingAdmin.setEmail(admin.getEmail());
            existingAdmin.setDob(admin.getDob());
            existingAdmin.setMobileNo(admin.getMobileNo());
            existingAdmin.setDoj(admin.getDoj());
            existingAdmin.setExperience(admin.getExperience());

            List<Address> addresses =
                    addressRepository.findAllById(
                            admin.getAddresses()
                                 .stream()
                                 .map(Address::getId)
                                 .toList());

            Company company =
                    companyRepository.findById(
                            admin.getCompany()
                                 .getCompanyId())
                    .orElse(null);

            Department department =
                    departmentRepository.findById(
                            admin.getDepartment()
                                 .getDeptId())
                    .orElse(null);

            Role role =
                    roleRepository.findById(
                            (int) admin.getRole()
                                 .getRoleId())
                    .orElse(null);

            existingAdmin.setAddresses(addresses);
            existingAdmin.setCompany(company);
            existingAdmin.setDepartment(department);
            existingAdmin.setRole(role);

            return adminRepository.save(existingAdmin);
        }

        return null;
    }
}