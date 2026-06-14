package com.example.serviceImple;

import java.util.List;

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
    private AddressRepository addressRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private CompanysTypeRepository companyTypeRepository;

    @Override
    public Company addData(Company company) {

        List<Address> addresses =
                addressRepository.findAllById(
                        company.getAddresses()
                               .stream()
                               .map(Address::getId)
                               .toList());

        Owner owner =
                ownerRepository.findById(
                        company.getOwner()
                               .getOwnerId())
                .orElse(null);

        List<CompanyType> companyTypes =
                companyTypeRepository.findAllById(
                        company.getCompanyTypes()
                               .stream()
                               .map(CompanyType::getTypeId)
                               .toList());

        company.setAddresses(addresses);
        company.setOwner(owner);
        company.setCompanyTypes(companyTypes);

        return companyRepository.save(company);
    }
}