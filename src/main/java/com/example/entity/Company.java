package com.example.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Company {

    @Id
    private int regNo;

    private String name;

    @OneToMany
    private List<Address> addresses;

    @OneToOne
    private Owner owner;

    @OneToMany(mappedBy = "company")
    private List<Manager> managers;

    @OneToMany(mappedBy = "company")
    private List<Admin> admins;

    @OneToMany(mappedBy = "company")
    private List<Employee> employees;

    @OneToMany(mappedBy = "company")
    private List<Department> departments;

    @OneToMany
    private List<CompanyType> companyTypes;

    public Company() {
    }

    public Company(int regNo, String name,
                   List<Address> addresses,
                   Owner owner,
                   List<Manager> managers,
                   List<Admin> admins,
                   List<Employee> employees,
                   List<Department> departments,
                   List<CompanyType> companyTypes) {

        this.regNo = regNo;
        this.name = name;
        this.addresses = addresses;
        this.owner = owner;
        this.managers = managers;
        this.admins = admins;
        this.employees = employees;
        this.departments = departments;
        this.companyTypes = companyTypes;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<CompanyType> getCompanyTypes() {
        return companyTypes;
    }

    public void setCompanyTypes(List<CompanyType> companyTypes) {
        this.companyTypes = companyTypes;
    }

    @Override
    public String toString() {
        return "Company [regNo=" + regNo +
               ", name=" + name + "]";
    }
}