package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.UserRepository;
import com.example.service.UserDeleteService;

@Service
public class UserDeleteServiceImple
        implements UserDeleteService {

    @Autowired
    private UserRepository repository;

    @Override
    public void deleteById(int id) {

        repository.deleteById(id);
    }
}