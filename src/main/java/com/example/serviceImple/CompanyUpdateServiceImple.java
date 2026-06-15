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
import com.example.service.CompanyUpdateService;

@Service
public class CompanyUpdateServiceImple
        implements CompanyUpdateService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private CompanysTypeRepository companyTypeRepository;



	@Override
	public Company updateData(Company company, int regNo) {
		// TODO Auto-generated method stub

		 Company existingCompany =
	                companyRepository.findById(regNo)
	                                 .orElse(null);

	        if (existingCompany != null) {

	            existingCompany.setName(
	                    company.getName());

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

	            existingCompany.setAddresses(addresses);
	            existingCompany.setOwner(owner);
	            existingCompany.setCompanyTypes(companyTypes);

	            return companyRepository.save(existingCompany);
	        }

	        return null;

	}


}