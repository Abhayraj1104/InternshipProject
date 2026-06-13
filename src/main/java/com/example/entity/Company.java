package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity

public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    private String companyName;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + "]";
	}

	public Company(Long companyId, String companyName, Type type, Owner owner, Address address) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.type = type;
		this.owner = owner;
		this.address = address;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}