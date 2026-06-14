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

import com.example.service.EmployeeUpdateService;

@Service
public class EmployeeUpdateServiceImple implements EmployeeUpdateService {

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
    public Employee updateData(Employee employee, int id) {

        Employee existingEmployee =
                employeeRepository.findById(id)
                                  .orElse(null);

        if (existingEmployee != null) {

            existingEmployee.setName(employee.getName());
            existingEmployee.setAdhar(employee.getAdhar());
            existingEmployee.setPanno(employee.getPanno());
            existingEmployee.setEmail(employee.getEmail());
            existingEmployee.setDob(employee.getDob());
            existingEmployee.setDoj(employee.getDoj());
            existingEmployee.setExperience(employee.getExperience());
            existingEmployee.setMobileNo(employee.getMobileNo());

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

            existingEmployee.setAddresses(addresses);
            existingEmployee.setCompany(company);
            existingEmployee.setManager(manager);
            existingEmployee.setDepartment(department);

            return employeeRepository.save(existingEmployee);
        }

        return null;
    }
}