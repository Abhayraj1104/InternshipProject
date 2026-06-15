package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.repository.RoleRepository;
import com.example.service.RoleFetchAllService;

@Service
public class RoleFetchAllServiceImple implements RoleFetchAllService {

    @Autowired
    private RoleRepository repository;

    @Override
    public List<Role> fetchAll() {
        return repository.findAll();
    }
}
