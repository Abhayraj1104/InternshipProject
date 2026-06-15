package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.repository.RoleRepository;
import com.example.service.RoleCreateService;

@Service
public class RoleCreateServiceImple implements RoleCreateService {

    @Autowired
    private RoleRepository repository;

    @Override
    public Role addData(Role role) {
        return repository.save(role);
    }
}
