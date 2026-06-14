package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Brand;
import com.example.entity.Company;
import com.example.repository.BrandRepository;
import com.example.repository.CompanyRepository;
import com.example.service.BrandUpdateService;

@Service
public class BrandUpdateServiceImple implements BrandUpdateService {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Brand updateData(Brand brand, Long id) {
        Brand existingBrand = brandRepository.findById(id).orElse(null);
        if (existingBrand != null) {
            existingBrand.setBrandName(brand.getBrandName());
            if (brand.getCompany() != null && brand.getCompany().getCompanyId() != null) {
                Company company = companyRepository.findById(brand.getCompany().getCompanyId()).orElse(null);
                existingBrand.setCompany(company);
            }
            return brandRepository.save(existingBrand);
        }
        return null;
    }
}
