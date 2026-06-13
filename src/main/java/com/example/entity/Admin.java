package com.example.entity;
import java.util.*;
import jakarta.persistence.*;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String adhar;
    private String panno;
    private String email;

    @Temporal(TemporalType.DATE)
    private Date dob;

    private String mobileNo;

    @Temporal(TemporalType.DATE)
    private Date doj;

    private String experience;

    @OneToMany
    @JoinColumn(name = "admin_id")
    private List<Address> addresses;

    @OneToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToOne
    @JoinColumn(name = "dept_id")
    private Department department;

    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
