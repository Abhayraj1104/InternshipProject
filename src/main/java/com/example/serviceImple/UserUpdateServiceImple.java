package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Role;
import com.example.entity.User;

import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;

import com.example.service.UserUpdateService;

@Service
public class UserUpdateServiceImple
        implements UserUpdateService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User updateData(User user,
                           int id) {

        User existingUser =
                userRepository.findById(id)
                              .orElse(null);

        if(existingUser != null) {

            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setMobile(user.getMobile());
            existingUser.setPassword(user.getPassword());

            Role role =
                    roleRepository.findById(
                            (int) user.getRole()
                                .getRoleId())
                    .orElse(null);

            existingUser.setRole(role);

            return userRepository.save(existingUser);
        }

        return null;
    }
}