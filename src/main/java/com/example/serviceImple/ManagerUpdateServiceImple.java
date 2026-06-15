package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.entity.Company;
import com.example.entity.Department;
import com.example.entity.Employee;
import com.example.entity.Manager;
import com.example.repository.AddressRepository;
import com.example.repository.CompanyRepository;
import com.example.repository.DepartmentRepository;
import com.example.repository.EmployeeRepository;
import com.example.repository.ManagerRepository;
import com.example.service.ManagerUpdateService;

@Service
public class ManagerUpdateServiceImple implements ManagerUpdateService {

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Manager updateData(Manager manager, int id) {

        Manager existingManager =
                managerRepository.findById(id)
                                 .orElse(null);

        if (existingManager != null) {

            existingManager.setName(manager.getName());
            existingManager.setAdhar(manager.getAdhar());
            existingManager.setPanno(manager.getPanno());
            existingManager.setEmail(manager.getEmail());
            existingManager.setExperience(manager.getExperience());
            existingManager.setSalary(manager.getSalary());
            existingManager.setDob(manager.getDob());
            existingManager.setDoj(manager.getDoj());
            existingManager.setMobileNo(manager.getMobileNo());

            Company company = companyRepository
                    .findById(manager.getCompany().getRegNo())
                    .orElse(null);

            Department department = departmentRepository
                    .findById(manager.getDepartment().getDid())
                    .orElse(null);

            List<Address> addresses = addressRepository.findAllById(
                    manager.getAddresses()
                           .stream()
                           .map(Address::getId)
                           .toList());

            List<Employee> employees = employeeRepository.findAllById(
                    manager.getEmployees()
                           .stream()
                           .map(Employee::getId)
                           .toList());

            existingManager.setCompany(company);
            existingManager.setDepartment(department);
            existingManager.setAddresses(addresses);
            existingManager.setEmployees(employees);

            return managerRepository.save(existingManager);
        }

        return null;
    }
}