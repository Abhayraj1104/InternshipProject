package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.entity.User;

import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;

import com.example.service.UserCreateService;

@Service
public class UserCreateServiceImple
        implements UserCreateService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User addData(User user) {

        Role role =
                roleRepository.findById(
                        (int) user.getRole().getRoleId())
                .orElse(null);

        user.setRole(role);

        return userRepository.save(user);
    }
}