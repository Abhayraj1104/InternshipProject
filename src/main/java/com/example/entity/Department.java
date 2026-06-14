package com.example.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int did;

    private String name;

    @OneToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @OneToMany
    @JoinColumn(name = "department_id")
    private List<Employee> employees;

    @OneToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "company_reg_no")
    private Company company;

    public Department() {
        super();
    }

    public Department(int did, String name, Manager manager,
                      List<Employee> employees,
                      Admin admin,
                      Company company) {
        super();
        this.did = did;
        this.name = name;
        this.manager = manager;
        this.employees = employees;
        this.admin = admin;
        this.company = company;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Department [did=" + did +
                ", name=" + name + "]";
    }
}