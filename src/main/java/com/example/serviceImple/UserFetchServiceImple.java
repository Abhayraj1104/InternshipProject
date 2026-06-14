package com.example.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserFetchService;

@Service
public class UserFetchServiceImple
        implements UserFetchService {

    @Autowired
    private UserRepository repository;

    @Override
    public User fetchById(int id) {

        return repository.findById(id)
                         .orElse(null);
    }
}