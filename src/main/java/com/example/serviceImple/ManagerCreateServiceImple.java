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
import com.example.service.ManagerCreateService;

@Service
public class ManagerCreateServiceImple implements ManagerCreateService {

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
    public Manager addData(Manager manager) {

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

        manager.setCompany(company);
        manager.setDepartment(department);
        manager.setAddresses(addresses);
        manager.setEmployees(employees);

        return managerRepository.save(manager);
    }
}