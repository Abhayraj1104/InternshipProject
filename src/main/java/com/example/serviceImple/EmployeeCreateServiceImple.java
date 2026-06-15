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
import com.example.service.EmployeeCreateService;

@Service
public class EmployeeCreateServiceImple implements EmployeeCreateService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Employee addData(Employee employee) {

        List<Address> addresses = addressRepository.findAllById(
                employee.getAddresses()
                        .stream()
                        .map(Address::getId)
                        .toList());

        Company company = companyRepository.findById(
                employee.getCompany().getRegNo())
                .orElse(null);

        Manager manager = managerRepository.findById(
                employee.getManager().getId())
                .orElse(null);

        Department department = departmentRepository.findById(
                employee.getDepartment().getDid())
                .orElse(null);

        employee.setAddresses(addresses);
        employee.setCompany(company);
        employee.setManager(manager);
        employee.setDepartment(department);

        return employeeRepository.save(employee);
    }
}