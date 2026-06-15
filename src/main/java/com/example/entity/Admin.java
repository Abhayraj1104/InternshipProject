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
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String adhar;

    private String panno;

    private String email;


    private Date dob;

    private String mobileNo;


    private Date doj;

    private String experience;

    @OneToMany
    @JsonBackReference
    @JoinColumn(name = "admin_id")
    private List<Address> addresses;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "company_reg_no")
    private Company company;

    @OneToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "role_id")
    private Role role;

    public Admin() {
        super();
    }

    public Admin(int id, String name, String adhar, String panno,
                 String email, Date dob, String mobileNo,
                 Date doj, String experience,
                 List<Address> addresses,
                 Company company,
                 Department department,
                 Role role) {

        this.id = id;
        this.name = name;
        this.adhar = adhar;
        this.panno = panno;
        this.email = email;
        this.dob = dob;
        this.mobileNo = mobileNo;
        this.doj = doj;
        this.experience = experience;
        this.addresses = addresses;
        this.company = company;
        this.department = department;
        this.role = role;
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


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin [id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", mobileNo=" + mobileNo + "]";
    }
}