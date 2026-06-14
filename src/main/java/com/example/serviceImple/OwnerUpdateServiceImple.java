package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Owner;
import com.example.repository.OwnerRepository;
import com.example.service.OwnerUpdateService;

@Service
public class OwnerUpdateServiceImple implements OwnerUpdateService {

    @Autowired
    private OwnerRepository repository;

    @Override
    public Owner updateData(Owner owner, Long id) {

        Owner existingOwner =
                repository.findById(id).orElse(null);

        if(existingOwner != null) {

            existingOwner.setName(owner.getName());
            existingOwner.setEmail(owner.getEmail());
            existingOwner.setMobile(owner.getMobile());

            return repository.save(existingOwner);
        }

        return null;
    }
}