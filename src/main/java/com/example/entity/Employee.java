package com.example.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String adhar;

    private String panno;

    private String email;

    
    private Date doj;

    private String experience;

  
    private Date dob;

    private String mobileNo;

    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<Address> addresses;

    @ManyToOne
    @JoinColumn(name = "company_reg_no")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String adhar, String panno,
                    String email, Date doj, String experience,
                    Date dob, String mobileNo,
                    List<Address> addresses,
                    Company company,
                    Manager manager,
                    Department department) {

        this.id = id;
        this.name = name;
        this.adhar = adhar;
        this.panno = panno;
        this.email = email;
        this.doj = doj;
        this.experience = experience;
        this.dob = dob;
        this.mobileNo = mobileNo;
        this.addresses = addresses;
        this.company = company;
        this.manager = manager;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAdhar() {
        return adhar;
    }

    public void setAdhar(String adhar) {
        this.adhar = adhar;
    }


    public String getPanno() {
        return panno;
    }

    public void setPanno(String panno) {
        this.panno = panno;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }


    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", mobileNo=" + mobileNo + "]";
    }
}