package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.repository.RoleRepository;
import com.example.service.RoleUpdateService;

@Service
public class RoleUpdateServiceImple implements RoleUpdateService {

    @Autowired
    private RoleRepository repository;

    @Override
    public Role updateData(Role role, Long id) {
        Role existingRole = repository.findById(id).orElse(null);
        if (existingRole != null) {
            existingRole.setRolename(role.getRolename());
            existingRole.setUsers(role.getUsers());
            return repository.save(existingRole);
        }
        return null;
    }
}
