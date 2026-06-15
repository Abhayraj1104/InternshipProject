package com.example.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String adhar;

    private String panno;

    private String email;

    private String experience;

    private float salary;


    private Date dob;


    private Date doj;

    private String mobileNo;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "company_reg_no")
    private Company company;

    @OneToOne(mappedBy = "manager")
    private Department department;

    @OneToMany
    @JsonBackReference
    @JoinColumn(name = "manager_id")
    private List<Address> addresses;

    @OneToMany
    @JsonBackReference
    @JoinColumn(name = "manager_id")
    private List<Employee> employees;

    public Manager() {
        super();
    }

    public Manager(int id, String name, String adhar, String panno,
                   String email, String experience, float salary,
                   Date dob, Date doj, String mobileNo,
                   Company company, Department department,
                   List<Address> addresses,
                   List<Employee> employees) {

        this.id = id;
        this.name = name;
        this.adhar = adhar;
        this.panno = panno;
        this.email = email;
        this.experience = experience;
        this.salary = salary;
        this.dob = dob;
        this.doj = doj;
        this.mobileNo = mobileNo;
        this.company = company;
        this.department = department;
        this.addresses = addresses;
        this.employees = employees;
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


    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }


    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }


    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }


    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Manager [id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", salary=" + salary + "]";
    }
}