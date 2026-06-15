package com.example.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.entity.Role;
import com.example.entity.User;

import com.example.repository.AddressRepository;
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

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public User updateData(User user, int id) {

        User existingUser =
                userRepository.findById(id)
                              .orElse(null);

        if (existingUser != null) {

            existingUser.setName(user.getName());
            existingUser.setAdhar(user.getAdhar());
            existingUser.setPanno(user.getPanno());
            existingUser.setEmail(user.getEmail());
            existingUser.setDob(user.getDob());
            existingUser.setMobileNo(user.getMobileNo());

            Role role =
                    roleRepository.findById(
                            user.getRole().getRoleId())
                    .orElse(null);

            List<Address> addresses =
                    addressRepository.findAllById(
                            user.getAddresses()
                                .stream()
                                .map(Address::getId)
                                .toList());

            existingUser.setRole(role);
            existingUser.setAddresses(addresses);

            return userRepository.save(existingUser);
        }

        return null;
    }
}