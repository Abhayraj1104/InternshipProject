package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.repository.RoleRepository;
import com.example.service.RoleFetchService;

@Service
public class RoleFetchServiceImple implements RoleFetchService {

    @Autowired
    private RoleRepository repository;

    @Override
    public Role fetchById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
