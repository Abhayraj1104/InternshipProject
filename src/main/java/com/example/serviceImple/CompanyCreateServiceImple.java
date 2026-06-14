package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.entity.Company;
import com.example.entity.CompanyType;
import com.example.entity.Owner;
import com.example.repository.AddressRepository;
import com.example.repository.CompanyRepository;
import com.example.repository.CompanysTypeRepository;
import com.example.repository.OwnerRepository;

import com.example.service.CompanyCreateService;

@Service
public class CompanyCreateServiceImple
        implements CompanyCreateService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanysTypeRepository typeRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Company addData(Company company) {

    	CompanyType type =
    	        typeRepository.findById(
    	                company.getType().getTypeId())
    	        .orElse(null);
    	
    	
        Owner owner =
                ownerRepository.findById(
                        company.getOwner().getOwnerId())
                .orElse(null);

        Address address =
                addressRepository.findById(
                        company.getAddress().getId())
                .orElse(null);

        company.setType(type);
        company.setOwner(owner);
        company.setAddress(address);

        return companyRepository.save(company);
    }
}