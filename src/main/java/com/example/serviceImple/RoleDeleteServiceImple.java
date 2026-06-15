package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.RoleRepository;
import com.example.service.RoleDeleteService;

@Service
public class RoleDeleteServiceImple implements RoleDeleteService {

    @Autowired
    private RoleRepository repository;

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
