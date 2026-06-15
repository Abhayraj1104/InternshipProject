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

import com.example.service.UserCreateService;

@Service
public class UserCreateServiceImple
        implements UserCreateService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public User addData(User user) {

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

        user.setRole(role);
        user.setAddresses(addresses);

        return userRepository.save(user);
    }
}